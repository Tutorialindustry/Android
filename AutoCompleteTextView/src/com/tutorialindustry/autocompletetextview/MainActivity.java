package com.tutorialindustry.autocompletetextview;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends Activity {

	AutoCompleteTextView autoCompleteTextView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		initUi();
		
		  String[] countries = getResources().getStringArray(R.array.list_of_cities);
				   ArrayAdapter adapter = new ArrayAdapter
				   (this,android.R.layout.simple_list_item_1,countries);
				   autoCompleteTextView.setThreshold(1);
				   autoCompleteTextView.setAdapter(adapter);
	}

	private void initUi() {
		autoCompleteTextView = (AutoCompleteTextView)findViewById(R.id.autocompletetextview);
	}



}
