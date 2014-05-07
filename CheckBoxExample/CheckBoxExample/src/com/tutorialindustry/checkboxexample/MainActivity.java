package com.tutorialindustry.checkboxexample;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener {

	CheckBox checkBox;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		initUi();
		
		checkBox.setOnClickListener(this);

	}

	private void initUi() {
		checkBox = (CheckBox)findViewById(R.id.checkBox1);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.checkBox1:
			if (checkBox.isChecked()) {
				Toast.makeText(MainActivity.this,"Checked", Toast.LENGTH_SHORT).show();
			}
			else if(!checkBox.isChecked())
			{
				Toast.makeText(MainActivity.this,"Un Checked", Toast.LENGTH_SHORT).show();
			}
			

			break;
		}		
	}
}
