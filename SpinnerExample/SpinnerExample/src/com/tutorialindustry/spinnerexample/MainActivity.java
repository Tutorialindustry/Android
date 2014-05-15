package com.tutorialindustry.spinnerexample;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends Activity implements OnItemSelectedListener {

	Spinner  citie_spinner;
	String[] cities;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		initUi();

		cities = getResources().getStringArray(R.array.cities_array);

		ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, cities);

		citie_spinner.setAdapter(arrayAdapter);

		citie_spinner.setOnItemSelectedListener(this);
	}
	private void initUi() {
		citie_spinner  = (Spinner)findViewById(R.id.spinner_cities);	
	}
	@Override
	public void onItemSelected(AdapterView<?> parent, View view, int position,
			long id) {
		Toast.makeText(MainActivity.this, cities[position],Toast.LENGTH_SHORT).show();
	}
	@Override
	public void onNothingSelected(AdapterView<?> parent) {

	}


}
