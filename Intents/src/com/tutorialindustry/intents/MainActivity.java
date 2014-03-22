package com.tutorialindustry.intents;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;

public class MainActivity extends  Activity implements OnClickListener{

	Intent intent;
	Button button;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);

		setContentView(R.layout.activity_main);

		initUi();
		button.setOnClickListener(this);
	}
	private void initUi()
	{
		button = (Button)findViewById(R.id.button);	
	}
	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.button:
			intent = new Intent(this,SecondActivity.class);
			intent.putExtra("Key", "Welcome");
			startActivity(intent);
			break;
		}
	}
}
