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
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class Times extends Activity {

	WebView wv;
	ProgressDialog ShowProgress;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_times);
		ActionBar actionBar = getActionBar();
		actionBar.hide();
		wv = (WebView) findViewById(R.id.webView11);
		wv.setBackgroundColor(00000000);
		WebSettings settings = wv.getSettings();
		settings.setDefaultTextEncodingName("utf-8");
		readWebpage(wv);

		ShowProgress = ProgressDialog.show(Times.this, "Bitte warten",
				"Daten werden geladen", true);
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
					String css = "<style type='text/css'>strong{color:white;font-size:18;font-family:Arial;} table{color:white;font-size:18;font-family:Arial;} h2{color:white;text-align:center}</style>";

					int startPosition = response.indexOf("<table");
					int endPosition = response.indexOf("</table>",
							startPosition);
					response = "<html><body>" + css
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
			wv.loadData(result, "text/html", "UTF-8");
			ShowProgress.dismiss();
		}
	}

	public void readWebpage(View view) {
		DownloadWebPageTask task = new DownloadWebPageTask();
		task.execute(new String[] { "http://www.htbla-weiz.at/index.php/unterrichtszeiten" });

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_times, menu);
		return true;
	}

}
