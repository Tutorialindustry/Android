package com.tutorialindustry.actionbarexample;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		MenuInflater inflater = getMenuInflater();
		inflater.inflate(R.menu.main, menu);

		return super.onCreateOptionsMenu(menu);
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Take appropriate action for each action item click
		switch (item.getItemId()) {

		case R.id.download:
			Toast.makeText(this, "Performing Download",Toast.LENGTH_SHORT).show();
			return true;
		case R.id.sendmsg:
			Toast.makeText(this, "Send Message Clicked",Toast.LENGTH_SHORT).show();
			return true;
		case R.id.openmsg:
			Toast.makeText(this, "Opening Msg",Toast.LENGTH_SHORT).show();
			return true;
		case R.id.search:
			Toast.makeText(this, "Searching....",Toast.LENGTH_SHORT).show();
			return true;
		default:
			return super.onOptionsItemSelected(item);
		}
	}

}
