package com.example.htlweiz;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class DisplayNews extends Activity {

	WebView wv;
	String link = "", desc = "", title = "", result = "";
	String css;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_display_news);

		ActionBar actionBar = getActionBar();
		actionBar.hide();

		wv = (WebView) findViewById(R.id.webView111);
		wv.setBackgroundColor(00000000);
		WebSettings settings = wv.getSettings();
		settings.setDefaultTextEncodingName("utf-8");

		css = "<style type='text/css'>p{color:white;font-size:15;font-family:Arial;} "
				+ "h2{color:white;text-align:left;font-size:22}"
				+ "img{border:3px solid #ffffff;max-width:95%;min-width:55%;height:auto;margin:10px}"
				+ "ul{color:white;font-size:15;font-family:Arial;}"
				+ "ol{color:white;font-size:15;font-family:Arial;}"
				+ "</style>";

		Intent i = getIntent();
		// getting attached intent data
		title = i.getStringExtra("title");
		desc = i.getStringExtra("desc");
		
		desc=desc.replaceAll("<img.*(width\\s*=\"0\"|height=\"0\").*/>", "");

		result = "<html><body>" + css + "<h2>" + title + "</h2>" + desc
				+ "</body></html>";

		wv.loadData(result, "text/html; charset=UTF-8", null);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.display_news, menu);
		return true;
	}

}
