package com.tutorialindustry.toastexample;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener{

	Button general_toast,custom_toast;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		initUi();
		general_toast.setOnClickListener(this);
		custom_toast.setOnClickListener(this);
	}

	private void initUi() {
		general_toast = (Button)findViewById(R.id.general_toast);
		custom_toast = (Button)findViewById(R.id.custom_toast);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.general_toast:
			showMassage("General Toast");
			break;

		case R.id.custom_toast:
			customToastMassage();
			break;
		}		
	}

	private void customToastMassage() {
		View view = getLayoutInflater().inflate(R.layout.custom_toast, null);
		Toast toast = new Toast(getApplicationContext());
		toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
		toast.setDuration(Toast.LENGTH_LONG);
		toast.setView(view);
		toast.show();
	}

	private void showMassage(String string) {
		Toast.makeText(this, string, Toast.LENGTH_LONG).show();		
	}

}
