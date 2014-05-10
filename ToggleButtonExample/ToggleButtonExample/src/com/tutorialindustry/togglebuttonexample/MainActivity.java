package com.tutorialindustry.togglebuttonexample;

import android.app.Activity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends Activity implements OnCheckedChangeListener {

	ToggleButton toggleButton;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		initUi();
		toggleButton.setOnCheckedChangeListener(this);
	}

	private void initUi() {
		toggleButton = (ToggleButton)findViewById(R.id.toggle_button);
	}

	@Override
	public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
		if (isChecked) {
			Toast.makeText(MainActivity.this,"Toggle On",Toast.LENGTH_SHORT).show();
		} else {
			Toast.makeText(MainActivity.this,"Toggle Off",Toast.LENGTH_SHORT).show();
		}		
	}

}
