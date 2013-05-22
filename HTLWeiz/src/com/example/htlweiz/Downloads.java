package com.example.htlweiz;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class Downloads extends Activity {

	String message = "";
	public final static String EXTRA_MESSAGE = "com.example.htlweiz.MESSAGE";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_downloads);

		ActionBar actionBar = getActionBar();
		actionBar.hide();

	}

	public void tages(View view) {
		message = "http://docs.google.com/gview?embedded=true&url=http://www.htbla-weiz.at/index.php/unterlagen/download/category/1-anmeldung?download=1:anmeldung-fuer-tageschule.pdf";
		Intent myIntent = new Intent(view.getContext(), ShowDownload.class);
		myIntent.putExtra(EXTRA_MESSAGE, message);
		view.getContext().startActivity(myIntent);
	}

	public void eltern(View view) {
		message = "http://docs.google.com/gview?embedded=true&url=http://www.htbla-weiz.at/index.php/unterlagen/download/category/1-anmeldung?download=2:elternmerkblatt.pdf";
		Intent myIntent = new Intent(view.getContext(), ShowDownload.class);
		myIntent.putExtra(EXTRA_MESSAGE, message);
		view.getContext().startActivity(myIntent);
	}

	public void kolleg(View view) {
		message = "http://docs.google.com/gview?embedded=true&url=http://www.htbla-weiz.at/index.php/unterlagen/download/category/1-anmeldung?download=3:kolleg-wirtschaftsingenieurwesen-betriebsinformatik.pdf";
		Intent myIntent = new Intent(view.getContext(), ShowDownload.class);
		myIntent.putExtra(EXTRA_MESSAGE, message);
		view.getContext().startActivity(myIntent);

	}

	public void abend(View view) {
		message = "http://docs.google.com/gview?embedded=true&url=http://www.htbla-weiz.at/index.php/unterlagen/download/category/1-anmeldung?download=4:anmeldeformular-fuer-die-abendschule.pdf";
		Intent myIntent = new Intent(view.getContext(), ShowDownload.class);
		myIntent.putExtra(EXTRA_MESSAGE, message);
		view.getContext().startActivity(myIntent);
	}

	public void anmelde(View view) {
		message = "http://docs.google.com/gview?embedded=true&url=http://www.htbla-weiz.at/index.php/unterlagen/download/category/3-berufsreifepruefung?download=9:anmeldeformular-fuer-die-berufsreifepruefung.pdf";
		Intent myIntent = new Intent(view.getContext(), ShowDownload.class);
		myIntent.putExtra(EXTRA_MESSAGE, message);
		view.getContext().startActivity(myIntent);
	}

	public void info(View view) {
		message = "http://docs.google.com/gview?embedded=true&url=http://www.htbla-weiz.at/index.php/unterlagen/download/category/3-berufsreifepruefung?download=11:informationen-zur-berufsreifepruefung-an-der-htbla-weiz.pdf";
		Intent myIntent = new Intent(view.getContext(), ShowDownload.class);
		myIntent.putExtra(EXTRA_MESSAGE, message);
		view.getContext().startActivity(myIntent);
	}

	public void extern(View view) {
		message = "http://docs.google.com/gview?embedded=true&url=http://www.htbla-weiz.at/index.php/unterlagen/download/category/3-berufsreifepruefung?download=12:anmeldeformular-zur-externistenpruefung-fuer-alle-nach-dem-01012009-zugelassenen.pdf";
		Intent myIntent = new Intent(view.getContext(), ShowDownload.class);
		myIntent.putExtra(EXTRA_MESSAGE, message);
		view.getContext().startActivity(myIntent);
	}

	public void entsch(View view) {
		message = "http://docs.google.com/gview?embedded=true&url=http://www.htbla-weiz.at/index.php/unterlagen/download/category/2-formulare?download=6:entschuldigung.pdf";
		Intent myIntent = new Intent(view.getContext(), ShowDownload.class);
		myIntent.putExtra(EXTRA_MESSAGE, message);
		view.getContext().startActivity(myIntent);
	}

	public void praktikum(View view) {
		message = "http://docs.google.com/gview?embedded=true&url=http://www.htbla-weiz.at/index.php/unterlagen/download/category/2-formulare?download=7:praktikumsbestaetigung.pdf";
		Intent myIntent = new Intent(view.getContext(), ShowDownload.class);
		myIntent.putExtra(EXTRA_MESSAGE, message);
		view.getContext().startActivity(myIntent);
	}

	public void schul(View view) {
		message = "http://docs.google.com/gview?embedded=true&url=http://www.htbla-weiz.at/index.php/unterlagen/download/category/2-formulare?download=8:schulabmeldung.pdf";
		Intent myIntent = new Intent(view.getContext(), ShowDownload.class);
		myIntent.putExtra(EXTRA_MESSAGE, message);
		view.getContext().startActivity(myIntent);
	}

	public void leit(View view) {
		message = "http://docs.google.com/gview?embedded=true&url=http://www.htbla-weiz.at/index.php/information/leitbild?download=21:leitbild.pdf";
		Intent myIntent = new Intent(view.getContext(), ShowDownload.class);
		myIntent.putExtra(EXTRA_MESSAGE, message);
		view.getContext().startActivity(myIntent);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_downloads, menu);
		return true;
	}

}
