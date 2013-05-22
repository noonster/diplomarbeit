package com.example.htlweiz;

import java.util.ArrayList;
import java.util.HashMap;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.app.ActionBar;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.os.StrictMode;
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

	JSONArray contacts = null;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		ActionBar actionBar = getActionBar();
		actionBar.hide();

		StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder()
				.permitAll().build();
		StrictMode.setThreadPolicy(policy);

		// Hashmap for ListView
		ArrayList<HashMap<String, String>> contactList = new ArrayList<HashMap<String, String>>();

		// Creating JSON Parser instance
		JSONParser jParser = new JSONParser();

		// getting JSON string from URL
		JSONObject json = jParser.getJSONFromUrl(url);

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
