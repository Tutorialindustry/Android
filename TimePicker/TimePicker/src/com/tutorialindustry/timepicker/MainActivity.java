package com.tutorialindustry.timepicker;

import java.util.Calendar;

import android.app.Activity;
import android.app.TimePickerDialog;
import android.app.TimePickerDialog.OnTimeSetListener;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity  extends Activity{

	ImageView timepicker;
	TextView time;
	protected void onCreate(Bundle b)
	{
		super.onCreate(b);
		setContentView(R.layout.activity_main);
		timepicker=(ImageView)findViewById(R.id.timepicker);
		time = (TextView)findViewById(R.id.time);
		timepicker.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				TimePickerDialog pickerDialog = new TimePickerDialog(MainActivity.this, new OnTimeSetListener() {

					@Override
					public void onTimeSet(TimePicker view, int selectedHour,
							int selectedMinute) {
						time.setText(selectedHour+"  "+selectedMinute);
					}
				},Calendar.HOUR_OF_DAY, Calendar.MINUTE, true);	
				pickerDialog.show();	
			}
		});

	}

}

