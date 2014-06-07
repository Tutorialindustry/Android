package com.tutorialindustry.notificationexample;

import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;

public class AlarmReceiver extends BroadcastReceiver{

	private NotificationManager mNotificationManager;
	Context context2;

	@Override
	public void onReceive(Context context, Intent intent) {
		context2 = context;
		callNotification();
	}

	private void callNotification() 
	{
		mNotificationManager = (NotificationManager) context2.getSystemService(Context.NOTIFICATION_SERVICE);

		NotificationCompat.Builder mBuilder = new NotificationCompat.Builder(context2);
		mBuilder.setSmallIcon(R.drawable.ic_launcher);
		mBuilder.setContentTitle("My notification");
		mBuilder.setContentText("Hello World!");
		
		mNotificationManager.notify(0,mBuilder.build());
	}
}
