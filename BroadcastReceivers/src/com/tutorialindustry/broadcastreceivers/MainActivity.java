package com.tutorialindustry.broadcastreceivers;

import java.util.Calendar;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.Window;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {

	Context context;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_main);
		context = this;
		sendBroadcastMethod(context);

	}
	private void sendBroadcastMethod(Context context)
	{
		Calendar calendar = Calendar.getInstance();

		Intent intent = new Intent(context, AlarmReceiver.class);
		PendingIntent pendingIntent = PendingIntent.getBroadcast(context, 0, intent, 0);

		AlarmManager alarmManager = (AlarmManager)getSystemService(ALARM_SERVICE); 
		alarmManager.set(AlarmManager.RTC_WAKEUP, calendar.getTimeInMillis() + (1000 * 60), pendingIntent);

		Toast.makeText(context, "Alarm Started", Toast.LENGTH_SHORT).show();
		Log.e("Alaram", "Alarm Started");
	}

}
