package com.tutorialindustry.raidogroupexample;

import android.app.Activity;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.Toast;

public class MainActivity extends Activity implements OnCheckedChangeListener {

	RadioGroup radioGroup1;
	RadioButton radioButton1,radioButton2,radioButton3,radioButton4;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		initUi();
		radioGroup1.setOnCheckedChangeListener(this);
	}

	private void initUi() {
		radioGroup1 = (RadioGroup)findViewById(R.id.radioGroup1);
		radioButton1 = (RadioButton)findViewById(R.id.radioButton1);
		radioButton2 = (RadioButton)findViewById(R.id.radioButton2);
		radioButton3 = (RadioButton)findViewById(R.id.radioButton3);
		radioButton4 = (RadioButton)findViewById(R.id.radioButton4);
	}

	@Override
	public void onCheckedChanged(RadioGroup group, int checkedId) {
		switch (checkedId) {
		case R.id.radioButton1:
			showToast("Radio Button 1 Clicked");
			break;
		case R.id.radioButton2:
			showToast("Radio Button 2 Clicked");
			break;
		case R.id.radioButton3:
			showToast("Radio Button 3 Clicked");
			break;
		case R.id.radioButton4:
			showToast("Radio Button 4 Clicked");
			break;
		}
	}

	private void showToast(String string) {
		Toast.makeText(MainActivity.this, string, Toast.LENGTH_SHORT).show();
	}


}
