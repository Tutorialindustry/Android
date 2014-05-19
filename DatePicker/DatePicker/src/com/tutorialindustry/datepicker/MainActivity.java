package com.tutorialindustry.datepicker;

import java.util.Calendar;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.DatePicker;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends Activity implements OnClickListener{

	TextView date;
	ImageView datepicker;
	Dialog dialog;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		date=(TextView)findViewById(R.id.date);
		datepicker=(ImageView)findViewById(R.id.datepicker);
		datepicker.setOnClickListener(this);

	}
	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.datepicker:
			showDialog(1);
			break;
		}
	}


	public Dialog onCreateDialog(int id)
	{
		Dialog dialog=null;
		switch(id)
		{
		case 1:
			Calendar c=Calendar.getInstance();
			int year=c.get(Calendar.YEAR);
			int monthOfYear=c.get(Calendar.MONTH);
			int dayOfMonth=c.get(Calendar.DAY_OF_MONTH);
			dialog=new DatePickerDialog(MainActivity.this, new DatePickerDialog.OnDateSetListener() {
				public void onDateSet(DatePicker view, int year, int monthOfYear,
						int dayOfMonth) {
					String selecteddate=(String.valueOf(dayOfMonth)).concat("/").concat(String.valueOf(monthOfYear+1)).concat("/").concat(String.valueOf(year));
					date.setText(selecteddate);
				}
			}, year, monthOfYear, dayOfMonth);
			break;
		}
		return dialog;
	}
}
