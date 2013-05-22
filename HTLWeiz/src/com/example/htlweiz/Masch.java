package com.example.htlweiz;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Masch extends Activity {

	public final static String EXTRA_MESSAGE = "com.example.htlweiz.MESSAGE";

	String message = "";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_depart);

		ActionBar actionBar = getActionBar();
		actionBar.hide();

		ListView listView = (ListView) findViewById(R.id.listView1);
		String[] values = new String[] { "E - Automatisierung",
				"E - Industrielle Informationstechnik",
				"M - Maschinen und Anlagentechnik", "M - Umwelttechnik",
				"W - Betriebsmanagement" };

		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
				R.layout.list_item, android.R.id.text1, values);

		listView.setAdapter(adapter);

		listView.setOnItemClickListener(new OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {

				switch (position) {
				case 0:
					message = "1";
					Intent myIntent = new Intent(view.getContext(),
							Depart2.class);
					myIntent.putExtra(EXTRA_MESSAGE, message);
					view.getContext().startActivity(myIntent);
					break;

				case 1:
					message = "2";
					Intent myIntent2 = new Intent(view.getContext(),
							Depart2.class);
					myIntent2.putExtra(EXTRA_MESSAGE, message);
					view.getContext().startActivity(myIntent2);
					break;

				case 2:
					message = "3";
					Intent myIntent3 = new Intent(view.getContext(),
							Depart2.class);
					myIntent3.putExtra(EXTRA_MESSAGE, message);
					view.getContext().startActivity(myIntent3);
					break;
				case 3:
					message = "4";
					Intent myIntent4 = new Intent(view.getContext(),
							Depart2.class);
					myIntent4.putExtra(EXTRA_MESSAGE, message);
					view.getContext().startActivity(myIntent4);
					break;

				case 4:
					message = "5";
					Intent myIntent5 = new Intent(view.getContext(),
							Depart2.class);
					myIntent5.putExtra(EXTRA_MESSAGE, message);
					view.getContext().startActivity(myIntent5);
					break;
				}
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_masch, menu);
		return true;
	}

}
