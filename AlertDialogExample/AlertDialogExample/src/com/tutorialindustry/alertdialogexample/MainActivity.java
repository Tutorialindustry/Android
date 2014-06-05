package com.tutorialindustry.alertdialogexample;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener{

	Button delete;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		initUi();
		delete.setOnClickListener(this);

	}

	private void initUi() {
		delete = (Button)findViewById(R.id.delete);
	}

	@Override
	public void onClick(View v) {
		showAlertDialog();		
	}

	private void showAlertDialog() 
	{
		AlertDialog.Builder builder= new AlertDialog.Builder(this);	
		builder.setTitle("Erase Usb Storage");
		builder.setCancelable(false).setMessage("Tutorial Industry");
		builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
			public void onClick(DialogInterface dialog,int id) {
				Toast.makeText(MainActivity.this,"Operation Performed", Toast.LENGTH_SHORT).show();
			}
		  });
		
		builder.setNegativeButton("Undo", new DialogInterface.OnClickListener() {
			public void onClick(DialogInterface dialog,int id) {
				Toast.makeText(MainActivity.this,"Operation is undo", Toast.LENGTH_SHORT).show();
			}
		  });
		
		AlertDialog alertDialog = builder.create();
		alertDialog.show();
	}

}
