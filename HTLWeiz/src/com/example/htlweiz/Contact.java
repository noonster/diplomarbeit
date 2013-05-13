package com.example.htlweiz;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ImageButton;

public class Contact extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_contact);

		ActionBar actionBar = getActionBar();
		actionBar.hide();

		ImageButton b1 = (ImageButton) findViewById(R.id.Button21);
		b1.setVisibility(View.VISIBLE);
		b1.setBackgroundColor(Color.TRANSPARENT);

		ImageButton b2 = (ImageButton) findViewById(R.id.Button22);
		b2.setVisibility(View.VISIBLE);
		b2.setBackgroundColor(Color.TRANSPARENT);

		ImageButton b3 = (ImageButton) findViewById(R.id.button23);
		b3.setVisibility(View.VISIBLE);
		b3.setBackgroundColor(Color.TRANSPARENT);
	}

	public void email(View view) {
		final Intent emailIntent = new Intent(
				android.content.Intent.ACTION_SEND);
		emailIntent.setType("plain/text");
		emailIntent.putExtra(android.content.Intent.EXTRA_EMAIL,
				new String[] { "office@htbla-weiz.ac.at" });
		startActivity(Intent.createChooser(emailIntent, "eMail senden"));
	}

	public void map(View view) {
		double latitude = 47.22438;
		double longitude = 15.62344;
		Uri uri = Uri.parse("geo:" + latitude + "," + longitude + "?z=18");
		Intent intent = new Intent(Intent.ACTION_VIEW, uri);
		startActivity(intent);
	}

	public void tel(View view) {
		String number = "+43 3172 4550";
		String uri = "tel:" + number.trim();
		Intent intent = new Intent(Intent.ACTION_DIAL);
		intent.setData(Uri.parse(uri));
		startActivity(intent);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_contact, menu);
		return true;
	}

}
