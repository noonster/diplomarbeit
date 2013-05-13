package com.example.htlweiz;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class Share extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_share);
		
		ActionBar actionBar = getActionBar();
		actionBar.hide();
		
        Button button1 = (Button)findViewById(R.id.Button11);
        button1.setVisibility(View.VISIBLE);
        button1.setBackgroundColor(Color.TRANSPARENT);
        
        Button button2 = (Button)findViewById(R.id.Button12);
        button2.setVisibility(View.VISIBLE);
        button2.setBackgroundColor(Color.TRANSPARENT);
        
        Button button3 = (Button)findViewById(R.id.Button13);
        button3.setVisibility(View.VISIBLE);
        button3.setBackgroundColor(Color.TRANSPARENT);
	}

	public void fb(View view)
	{
		 Intent intent = new Intent(Intent.ACTION_SEND);
		 intent.setType("text/plain");
		 intent.putExtra(Intent.EXTRA_TEXT, "Die HTL App ist da :)");
		 startActivity(Intent.createChooser(intent, "Dialog title text"));

	}    
    public void mail(View view)
    {
		final Intent emailIntent = new Intent(android.content.Intent.ACTION_SEND);
		emailIntent.setType("plain/text");
		emailIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "Die neue HTL App ist da");
		emailIntent.putExtra(android.content.Intent.EXTRA_TEXT, "Downloadlinkwhutupppppp");
		startActivity(Intent.createChooser(emailIntent, "Send mail..."));
    }
	public void twitter(View view)
	{    	

	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_share, menu);
		return true;
	}

}
