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

public class Depart extends Activity {

	public final static String EXTRA_MESSAGE = "com.example.htlweiz.MESSAGE";

	String message = "";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_depart);

		ActionBar actionBar = getActionBar();
		actionBar.hide();

		ListView listView = (ListView) findViewById(R.id.listView1);
		String[] values = new String[] { "Höhere Technische", "Fachschule",
				"Abendschule", "Kolleg" };

		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
				R.layout.list_itembig, R.id.name1, values);

		listView.setAdapter(adapter);

		listView.setOnItemClickListener(new OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {

				switch (position) {
				case 0:
					Intent myIntent2 = new Intent(view.getContext(),
							Masch.class);
					view.getContext().startActivity(myIntent2);
					break;

				case 1:
					Intent myIntent3 = new Intent(view.getContext(),
							Wirtschaft.class);
					view.getContext().startActivity(myIntent3);
					break;

				case 2:
					Intent myIntent4 = new Intent(view.getContext(), Fufe.class);
					view.getContext().startActivity(myIntent4);
					break;

				case 3:
					message = "0";
					Intent myIntent = new Intent(view.getContext(),
							Depart2.class);
					myIntent.putExtra(EXTRA_MESSAGE, message);
					view.getContext().startActivity(myIntent);
					break;
				}
			}
		});

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_depart, menu);
		return true;
	}

}
