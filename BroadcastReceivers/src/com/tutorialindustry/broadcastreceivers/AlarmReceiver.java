package com.tutorialindustry.broadcastreceivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class AlarmReceiver extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, Intent intent) {
		Toast.makeText(context, "Time Up", Toast.LENGTH_SHORT).show();
		Log.e("Alaram", "Time Up");
		
	}

}
