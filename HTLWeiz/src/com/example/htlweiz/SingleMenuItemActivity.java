package com.example.htlweiz;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class SingleMenuItemActivity extends Activity {

	public String email = "";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_single_menu_item);

		ActionBar actionBar = getActionBar();
		actionBar.hide();

		TextView txtName = (TextView) findViewById(R.id.name);
		TextView txtCost = (TextView) findViewById(R.id.cost);
		TextView txtDesc = (TextView) findViewById(R.id.desc);

		Intent i = getIntent();
		// getting attached intent data
		String name = i.getStringExtra("name");
		String cost = i.getStringExtra("con_position");
		String description = i.getStringExtra("misc");
		email = i.getStringExtra("email_to");

		description = description.replaceAll("\\<.*?>","");
		description = description.replace("Sprechstunde:", "");
		description = description.replace("Nebenstelle:", "\n" + " Nebenstelle:");

		// displaying selected product name
		txtName.setText(name);
		txtCost.setText(cost);
		txtDesc.setText(description);
	}

	public void emailsend(View view) {
		if (email != null) {
			final Intent emailIntent = new Intent(
					android.content.Intent.ACTION_SEND);
			emailIntent.setType("plain/text");
			emailIntent.putExtra(android.content.Intent.EXTRA_EMAIL,
					new String[] { email });
			startActivity(Intent.createChooser(emailIntent, "eMail senden"));
		} else {
			Toast toast = Toast.makeText(this,
					"Dieser Kontakt hat besitzt keine eMail",
					Toast.LENGTH_SHORT);
			toast.show();
		}

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.single_menu_item, menu);
		return true;
	}

}
