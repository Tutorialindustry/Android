package com.tutorialindustry.sampleservices;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.widget.Toast;

public class MyService extends Service 
{

	@Override
	public IBinder onBind(Intent intent) 
	{

		return null;
	}

	@Override
	public int onStartCommand(Intent intent, int flags, int startId) 
	{
		showMessage("Service Started");
		return super.onStartCommand(intent, flags, startId);
	}

	@Override
	public void onDestroy() 
	{
		super.onDestroy();
		showMessage("Service Stopped");
	}

	private void showMessage(String msg)
	{
		Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
	}

}
