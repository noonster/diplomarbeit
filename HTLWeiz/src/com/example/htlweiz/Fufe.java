package com.example.htlweiz;

import android.os.Bundle;
import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;

public class Fufe extends Activity {

	public final static String EXTRA_MESSAGE = "com.example.htlweiz.MESSAGE";
	String message = "";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_depart);

		ActionBar actionBar = getActionBar();
		actionBar.hide();

		ListView listView = (ListView) findViewById(R.id.listView1);
		String[] values = new String[] { "Wirtschaftsingenieurwesen", "Elektrotechnik - Wirtschaft"};

		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
				R.layout.list_item, android.R.id.text1, values);

		listView.setAdapter(adapter);

		listView.setOnItemClickListener(new OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {

				switch (position) {
				case 0:
					message = "9";
					Intent myIntent = new Intent(view.getContext(),
							Depart2.class);
					myIntent.putExtra(EXTRA_MESSAGE, message);
					view.getContext().startActivity(myIntent);
					break;

				case 1:
					message = "10";
					Intent myIntent2 = new Intent(view.getContext(),
							Depart2.class);
					myIntent2.putExtra(EXTRA_MESSAGE, message);
					view.getContext().startActivity(myIntent2);
					break;

				}
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_fufe, menu);
		return true;
	}

}
