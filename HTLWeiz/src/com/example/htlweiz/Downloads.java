package com.example.htlweiz;

import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.webkit.WebView;

@SuppressLint("SetJavaScriptEnabled")
public class Downloads extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_downloads);
		ActionBar actionBar = getActionBar();
		actionBar.hide();
	}

	public void tages(View view) {
		WebView webview = new WebView(this);
		setContentView(webview);
		webview.getSettings().setJavaScriptEnabled(true);
		webview.loadUrl("http://docs.google.com/gview?embedded=true&url=http://www.htbla-weiz.at/index.php/unterlagen/download/category/1-anmeldung?download=1:anmeldung-fuer-tageschule.pdf");
	}

	public void eltern(View view) {
		WebView webview = new WebView(this);
		setContentView(webview);
		webview.getSettings().setJavaScriptEnabled(true);
		webview.loadUrl("http://docs.google.com/gview?embedded=true&url=http://www.htbla-weiz.at/index.php/unterlagen/download/category/1-anmeldung?download=2:elternmerkblatt.pdf");
	}

	public void kolleg(View view) {
		WebView webview = new WebView(this);
		setContentView(webview);
		webview.getSettings().setJavaScriptEnabled(true);
		webview.loadUrl("http://docs.google.com/gview?embedded=true&url=http://www.htbla-weiz.at/index.php/unterlagen/download/category/1-anmeldung?download=3:kolleg-wirtschaftsingenieurwesen-betriebsinformatik.pdf");
	}

	public void abend(View view) {
		WebView webview = new WebView(this);
		setContentView(webview);
		webview.getSettings().setJavaScriptEnabled(true);
		webview.loadUrl("http://docs.google.com/gview?embedded=true&url=http://www.htbla-weiz.at/index.php/unterlagen/download/category/1-anmeldung?download=4:anmeldeformular-fuer-die-abendschule.pdf");
	}

	public void anmelde(View view) {
		WebView webview = new WebView(this);
		setContentView(webview);
		webview.getSettings().setJavaScriptEnabled(true);
		webview.loadUrl("http://docs.google.com/gview?embedded=true&url=http://www.htbla-weiz.at/index.php/unterlagen/download/category/3-berufsreifepruefung?download=9:anmeldeformular-fuer-die-berufsreifepruefung.pdf");
	}

	public void info(View view) {
		WebView webview = new WebView(this);
		setContentView(webview);
		webview.getSettings().setJavaScriptEnabled(true);
		webview.loadUrl("http://docs.google.com/gview?embedded=true&url=http://www.htbla-weiz.at/index.php/unterlagen/download/category/3-berufsreifepruefung?download=11:informationen-zur-berufsreifepruefung-an-der-htbla-weiz.pdf");
	}

	public void extern(View view) {
		WebView webview = new WebView(this);
		setContentView(webview);
		webview.getSettings().setJavaScriptEnabled(true);
		webview.loadUrl("http://docs.google.com/gview?embedded=true&url=http://www.htbla-weiz.at/index.php/unterlagen/download/category/3-berufsreifepruefung?download=12:anmeldeformular-zur-externistenpruefung-fuer-alle-nach-dem-01012009-zugelassenen.pdf");
	}

	public void entsch(View view) {
		WebView webview = new WebView(this);
		setContentView(webview);
		webview.getSettings().setJavaScriptEnabled(true);
		webview.loadUrl("http://docs.google.com/gview?embedded=true&url=http://www.htbla-weiz.at/index.php/unterlagen/download/category/2-formulare?download=6:entschuldigung.pdf");
	}

	public void praktikum(View view) {
		WebView webview = new WebView(this);
		setContentView(webview);
		webview.getSettings().setJavaScriptEnabled(true);
		webview.loadUrl("http://docs.google.com/gview?embedded=true&url=http://www.htbla-weiz.at/index.php/unterlagen/download/category/2-formulare?download=7:praktikumsbestaetigung.pdf");
	}

	public void schul(View view) {
		WebView webview = new WebView(this);
		setContentView(webview);
		webview.getSettings().setJavaScriptEnabled(true);
		webview.loadUrl("http://docs.google.com/gview?embedded=true&url=http://www.htbla-weiz.at/index.php/unterlagen/download/category/2-formulare?download=8:schulabmeldung.pdf");
	}

	public void leit(View view) {
		WebView webview = new WebView(this);
		setContentView(webview);
		webview.getSettings().setJavaScriptEnabled(true);
		webview.loadUrl("http://docs.google.com/gview?embedded=true&url=http://www.htbla-weiz.at/index.php/information/leitbild?download=21:leitbild.pdf");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_downloads, menu);
		return true;
	}

}
