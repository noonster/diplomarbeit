package com.example.htlweiz;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.app.ActionBar;
import android.app.ListActivity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

public class Teachers extends ListActivity {

	private static String url = "http://www.htbla-weiz.at/eigen/AppHTLLehrer1.php";

	private static final String TAG_USERS = "users";
	private static final String TAG_NAME = "name";
	private static final String TAG_CON_POSITION = "con_position";
	private static final String TAG_MISC = "misc";
	private static final String TAG_EMAIL_TO = "email_to";

	static InputStream is = null;
	static JSONObject jObj = null;
	static String jsonstrg = "";

	JSONArray contacts = null;
	JSONObject json;

	ProgressDialog ShowProgress;
	ArrayList<HashMap<String, String>> contactList;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_teachers);

		ActionBar actionBar = getActionBar();
		actionBar.hide();

		ShowProgress = ProgressDialog.show(Teachers.this, "Bitte warten",
				"Daten werden geladen", true);

		contactList = new ArrayList<HashMap<String, String>>();

		getJSONFromUrl();

	}

	public void getJSONFromUrl() {

		readWebpage();

	}

	private class DownloadWebPageTask extends AsyncTask<String, Void, String> {
		@Override
		protected String doInBackground(String... urls) {
			String response = "";
			for (String url : urls) {
				DefaultHttpClient client = new DefaultHttpClient();
				HttpGet httpGet = new HttpGet(url);
				try {
					HttpResponse execute = client.execute(httpGet);
					InputStream content = execute.getEntity().getContent();

					BufferedReader buffer = new BufferedReader(
							new InputStreamReader(content));
					String s = "";
					while ((s = buffer.readLine()) != null) {
						response += s;
					}

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			return response;
		}

		@Override
		protected void onPostExecute(String result) {
			jsonstrg = result;

			// try parse the string to a JSON object
			try {
				jObj = new JSONObject(jsonstrg);
			} catch (JSONException e) {
				Log.e("JSON Parser", "Error parsing data " + e.toString());
			}
			retobj(jObj);
			ShowProgress.dismiss();

		}
	}

	public void readWebpage() {
		DownloadWebPageTask task = new DownloadWebPageTask();
		task.execute(new String[] { url });

	}

	public void retobj(JSONObject job) {
		json = job;

		try {
			// Getting Array of Contacts
			contacts = json.getJSONArray(TAG_USERS);

			// looping through All Contacts
			for (int i = 0; i < contacts.length(); i++) {
				JSONObject c = contacts.getJSONObject(i);

				// Storing each json item in variable
				// String id = "";
				String name = c.getString(TAG_NAME);
				String con_position = c.getString(TAG_CON_POSITION);
				String misc = c.getString(TAG_MISC);
				String email_to = c.getString(TAG_EMAIL_TO);

				// creating new HashMap
				HashMap<String, String> map = new HashMap<String, String>();

				// adding each child node to HashMap key => value
				// map.put(TAG_ID, id);
				map.put(TAG_NAME, name);
				map.put(TAG_CON_POSITION, con_position);
				map.put(TAG_MISC, misc);
				map.put(TAG_EMAIL_TO, email_to);

				// adding HashList to ArrayList
				contactList.add(map);
			}
		} catch (JSONException e) {
			e.printStackTrace();
		}

		/**
		 * Updating parsed JSON data into ListView
		 * */
		ListAdapter adapter = new SimpleAdapter(this, contactList,
				R.layout.list_itembig, new String[] { TAG_NAME,
						TAG_CON_POSITION, TAG_MISC, TAG_EMAIL_TO }, new int[] {
						R.id.name1, R.id.cost1, R.id.desc1, R.id.emailto1 });

		setListAdapter(adapter);

		// selecting single ListView item
		ListView lv = getListView();

		// Launching new screen on Selecting Single ListItem
		lv.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				// getting values from selected ListItem
				String name = ((TextView) view.findViewById(R.id.name1))
						.getText().toString();
				String cost = ((TextView) view.findViewById(R.id.cost1))
						.getText().toString();
				String description = ((TextView) view.findViewById(R.id.desc1))
						.getText().toString();
				String emailto = ((TextView) view.findViewById(R.id.emailto1))
						.getText().toString();

				// Starting new intent
				Intent in = new Intent(getApplicationContext(),
						SingleMenuItemActivity.class);
				in.putExtra(TAG_NAME, name);
				in.putExtra(TAG_CON_POSITION, cost);
				in.putExtra(TAG_MISC, description);
				in.putExtra(TAG_EMAIL_TO, emailto);
				startActivity(in);
			}
		});
	}

}
