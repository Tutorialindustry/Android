package com.tutorialindustry.menugroup;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {

		TextView selected_blood_group = (TextView)findViewById(R.id.selected_blood_group);

		switch (item.getItemId()) {
		case R.id.a_positive:
			if (item.isChecked()) item.setChecked(false);
			else item.setChecked(true);
			selected_blood_group.setText("Your Are Selected : A+");
			return true;
		case R.id.b_positive:
			if (item.isChecked()) item.setChecked(false);
			else item.setChecked(true);
			selected_blood_group.setText("Your Are Selected : B+");
			return true;
		case R.id.o_positive:
			if (item.isChecked()) item.setChecked(false);
			else item.setChecked(true);
			selected_blood_group.setText("Your Are Selected : O+");
			return true;
		case R.id.ab_positive:
			if (item.isChecked()) item.setChecked(false);
			else item.setChecked(true);
			selected_blood_group.setText("Your Are Selected : AB+");
			return true;
		case R.id.a_negative:
			if (item.isChecked()) item.setChecked(false);
			else item.setChecked(true);
			selected_blood_group.setText("Your Are Selected : A-");
			return true;
		case R.id.b_negative:
			if (item.isChecked()) item.setChecked(false);
			else item.setChecked(true);
			selected_blood_group.setText("Your Are Selected : B-");
			return true;
		case R.id.o_negative:
			if (item.isChecked()) item.setChecked(false);
			else item.setChecked(true);
			selected_blood_group.setText("Your Are Selected : O-");
			return true;
		case R.id.ab_negative:
			if (item.isChecked()) item.setChecked(false);
			else item.setChecked(true);
			selected_blood_group.setText("Your Are Selected : AB-");
			return true;
		default:
			return super.onOptionsItemSelected(item);
		}
	}
}
