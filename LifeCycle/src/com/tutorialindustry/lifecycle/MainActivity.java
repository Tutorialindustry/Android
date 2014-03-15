package com.tutorialindustry.lifecycle;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends Activity 
{

	// Called when the activity is first created. 
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		printMessage("onCreate");
	}

	// Called when the activity is about to become visible.
	@Override
	protected void onStart() 
	{
		super.onStart();
		printMessage("onStart");
	}

	// Called after your activity has been stopped, prior to it being started again. Always followed by onStart()
	@Override
	protected void onRestart() 
	{
		super.onRestart();
		printMessage("onRestart");
	}

	// Called when the activity has become visible.
	@Override
	protected void onResume() 
	{
		super.onResume();
		printMessage("onResume");
	}

	// Called when another activity is taking focus.
	@Override
	protected void onPause() 
	{
		super.onPause();
		printMessage("onPause");
	}

	// Called when the activity is no longer visible.
	@Override
	protected void onStop() 
	{
		super.onStop();
		printMessage("onStop");
	}

	// Called just before the activity is destroyed.
	@Override
	protected void onDestroy() 
	{
		super.onDestroy();
		printMessage("onDestroy");
	}

	private void printMessage(String message)
	{
		Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
		Log.i("MethodName", message);
	}
}
