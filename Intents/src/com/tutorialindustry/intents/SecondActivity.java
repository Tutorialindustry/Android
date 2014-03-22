package com.tutorialindustry.intents;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.widget.Toast;

public class SecondActivity extends Activity {

	Intent intent;
	String intenttext;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_second);

		intenttext = getIntent().getStringExtra("Key");
		Toast.makeText(this, ""+intenttext, Toast.LENGTH_SHORT).show();
	}

}