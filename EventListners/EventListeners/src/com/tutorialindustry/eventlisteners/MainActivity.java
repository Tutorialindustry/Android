package com.tutorialindustry.eventlisteners;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.View.OnTouchListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener,OnLongClickListener,OnTouchListener
{

	Button buttonclick,buttonlongclick,buttontouchclick,buttonkeyclick;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		initUi();

		buttonclick.setOnClickListener(this);
		buttonlongclick.setOnLongClickListener(this);
		buttontouchclick.setOnTouchListener(this);
	}

	private void initUi() {
		buttonclick = (Button)findViewById(R.id.buttonclick);
		buttonlongclick = (Button)findViewById(R.id.buttonlongclick);
		buttontouchclick = (Button)findViewById(R.id.buttontouchclick);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.buttonclick:
			Toast.makeText(this,"On Click", Toast.LENGTH_SHORT).show();
			break;
		}
	}
	@Override
	public boolean onLongClick(View v) 
	{
		switch (v.getId())
		{
		case R.id.buttonlongclick:
			Toast.makeText(this,"On Long Click", Toast.LENGTH_SHORT).show();
			break;
		}
		return false;
	}
	@Override
	public boolean onTouch(View v, MotionEvent event) 
	{
		switch (v.getId()) {
		case R.id.buttontouchclick:
			Toast.makeText(this,"On Touch", Toast.LENGTH_SHORT).show();
			break;
		}
		return false;
	}
	@Override
	public boolean onKeyUp(int keyCode, KeyEvent event) {
	    switch (keyCode) {
	 
	        case KeyEvent.KEYCODE_D:
	        	
	        	Toast.makeText(this,"On Key", Toast.LENGTH_SHORT).show();
	    }
	    return true;
	}

}
