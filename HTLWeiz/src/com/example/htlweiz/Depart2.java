package com.example.htlweiz;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

import android.app.ActionBar;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.TextView;

public class Depart2 extends Activity {

	ProgressDialog ShowProgress;
	String url = "";
	WebView wv;
	String response = "";
	String message = "";
	public final static String EXTRA_MESSAGE = "com.example.htlweiz.MESSAGE";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_depart2);

		ActionBar actionBar = getActionBar();
		actionBar.hide();

		wv = (WebView) findViewById(R.id.webView12);
		wv.setBackgroundColor(00000000);
		WebSettings settings = wv.getSettings();
		settings.setDefaultTextEncodingName("utf-8");

		ShowProgress = ProgressDialog.show(Depart2.this, "Bitte warten",
				"Daten werden geladen", true);

		TextView header = (TextView) findViewById(R.id.textView1);

		Intent intent = getIntent();
		String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
		int aint = Integer.parseInt(message);

		switch (aint) {
		case 0:
			header.setText("Kolleg Betriebsinformatik");
			url = "http://www.htbla-weiz.at/index.php/kolleg";
			break;
		case 3:
			header.setText("Maschinen - Anlagentechnik");
			url = "http://www.htbla-weiz.at/index.php/maschinentechnik-edv";
			break;
		case 4:
			header.setText("Umwelttechnik");
			url = "http://www.htbla-weiz.at/index.php/umwelttechnik";
			break;
		case 5:
			header.setText("Betriebsmanagement");
			url = "http://www.htbla-weiz.at/index.php/betriebsmanagement";
			break;
		case 7:
			header.setText("Informationstechnik");
			url = "http://www.htbla-weiz.at/index.php/fachschule-fuer-informationstechnik";
			break;
		case 8:
			header.setText("Fertigungstechnik");
			url = "http://www.htbla-weiz.at/index.php/fachschule-fuer-maschinenbau-fertigungstechnik";
			break;
		case 9:
			header.setText("Wirtschaftsingenieurwesen");
			url = "http://www.htbla-weiz.at/index.php/abendschule/wirtschaftsingenieurwesen";
			break;
		case 10:
			header.setText("Elektrotechnik - Wirtschaft");
			url = "http://www.htbla-weiz.at/index.php/abendschule/elektrotechnik-wirtschaft";
			break;
		}
		readWebpage(wv);
	}

	private class DownloadWebPageTask extends AsyncTask<String, Void, String> {
		@Override
		protected String doInBackground(String... urls) {

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

					String css = "<style type='text/css'>p{color:white;font-size:15;font-family:Arial;} "
							+ "h2{color:white;text-align:left;font-size:22}"
							+ "img{max-width:95%;min-width:55%;height:auto}"
							+ "ul{color:white;font-size:15;font-family:Arial;}"
							+ "ol{color:white;font-size:15;font-family:Arial;}"
							+ "</style>";

					int startPosition = response.indexOf("Berufs");
					int endPosition = response.indexOf("<div id=",
							startPosition);
					response = "<html><body>" + css + "<h2>"
							+ response.substring(startPosition, endPosition)
							+ "</body></html>";

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			return response;
		}

		@Override
		protected void onPostExecute(String result) {
			wv.loadData(result, "text/html; charset=UTF-8", null);
			ShowProgress.dismiss();
		}
	}

	public void readWebpage(View view) {
		DownloadWebPageTask task = new DownloadWebPageTask();
		task.execute(new String[] { url });

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_depart2, menu);
		return true;
	}

}
