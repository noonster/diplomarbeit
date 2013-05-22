package com.example.htlweiz;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class Splash extends Activity {

	View view;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_splash);

		ActionBar actionBar = getActionBar();
		actionBar.hide();

		Thread timer = new Thread() {
			public void run() {
				try {
					sleep(2500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				} finally {
					Intent intent3 = new Intent(getApplicationContext(),
							MainActivity.class);
					startActivity(intent3);
				}
			}
		};
		timer.start();
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		finish();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.splash, menu);
		return true;
	}

}
