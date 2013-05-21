package com.example.htlweiz;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

	public final static String EXTRA_MESSAGE = "com.example.htlweiz.MESSAGE";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		ActionBar actionBar = getActionBar();
		actionBar.hide();

		Button b1 = (Button) findViewById(R.id.Button1);
		b1.setVisibility(View.VISIBLE);
		b1.setBackgroundColor(Color.TRANSPARENT);

		Button b2 = (Button) findViewById(R.id.Button2);
		b2.setVisibility(View.VISIBLE);
		b2.setBackgroundColor(Color.TRANSPARENT);

		Button b3 = (Button) findViewById(R.id.button3);
		b3.setVisibility(View.VISIBLE);
		b3.setBackgroundColor(Color.TRANSPARENT);

		Button b4 = (Button) findViewById(R.id.Button4);
		b4.setVisibility(View.VISIBLE);
		b4.setBackgroundColor(Color.TRANSPARENT);

		Button b5 = (Button) findViewById(R.id.Button5);
		b5.setVisibility(View.VISIBLE);
		b5.setBackgroundColor(Color.TRANSPARENT);

		Button b6 = (Button) findViewById(R.id.button6);
		b6.setVisibility(View.VISIBLE);
		b6.setBackgroundColor(Color.TRANSPARENT);

		Button b7 = (Button) findViewById(R.id.Button7);
		b7.setVisibility(View.VISIBLE);
		b7.setBackgroundColor(Color.TRANSPARENT);

		Button b8 = (Button) findViewById(R.id.Button8);
		b8.setVisibility(View.VISIBLE);
		b8.setBackgroundColor(Color.TRANSPARENT);

		Button b9 = (Button) findViewById(R.id.button9);
		b9.setVisibility(View.VISIBLE);
		b9.setBackgroundColor(Color.TRANSPARENT);
	}

	public void url(View view) {
		Intent browser = new Intent(Intent.ACTION_VIEW,
				Uri.parse("http://www.htbla-weiz.ac.at"));
		startActivity(browser);
	}

	public void open(View view) {
		Intent intent1 = new Intent(this, Depart.class);
		startActivity(intent1);
	}

	public void share(View view) {
		Intent intent = new Intent(Intent.ACTION_SEND);
		intent.setType("text/plain");
		intent.putExtra(Intent.EXTRA_TEXT,
				"Die neue HTL Weiz App für Android ist da. Download: ");
		intent.putExtra(Intent.EXTRA_SUBJECT, "Neu: HTL Weiz App");
		startActivity(Intent.createChooser(intent, "Teilen"));
	}

	public void contact(View view) {
		Intent intent3 = new Intent(this, Contact.class);
		startActivity(intent3);
	}

	public void news(View view) {
		Intent intent8 = new Intent(this, News.class);
		startActivity(intent8);
	}

	public void imp(View view) {
		Intent intent4 = new Intent(this, Imp.class);
		startActivity(intent4);
	}

	public void times(View view) {
		Intent intent5 = new Intent(this, Times.class);
		startActivity(intent5);
	}

	public void down(View view) {
		Intent intent6 = new Intent(this, Downloads.class);
		startActivity(intent6);
	}

	public void teachers(View view) {

		Intent intent7 = new Intent(this, Teachers.class);
		startActivity(intent7);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}
