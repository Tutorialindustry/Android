package com.tutorialindustry.sampleservices;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;

public class MainActivity extends Activity implements OnClickListener
{

	Button start_service, stop_service;
	Intent intent;

	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_main);

		initUi();
		start_service.setOnClickListener(this);
		stop_service.setOnClickListener(this);
	}

	private void initUi() 
	{
		start_service = (Button)findViewById(R.id.start_service); 
		stop_service = (Button)findViewById(R.id.stop_service);
	}

	@Override
	public void onClick(View v) 
	{
		switch (v.getId()) 
		{
		case R.id.start_service:
			intent = new Intent(this, MyService.class);
			startService(intent);
			break;

		case R.id.stop_service:
			intent = new Intent(this, MyService.class);
			stopService(intent);
			break;
		}
	}

}
