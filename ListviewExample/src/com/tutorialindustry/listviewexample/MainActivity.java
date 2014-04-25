package com.tutorialindustry.listviewexample;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity implements OnItemClickListener {

	ListView listView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		initUi();
		
		settingAdapter();
		
		listView.setOnItemClickListener(this);
	}

	private void settingAdapter() {
		listView.setAdapter(new ListAdapter(this));
	}

	private void initUi()
	{
		listView = (ListView)findViewById(R.id.listview);		
	}

	@Override
	public void onItemClick(AdapterView<?> parent, View view, int position,
			long id) {
		
		ListAdapter listAdapter = new ListAdapter(this);
		
		String selecteditem = listAdapter.movies[position];
		
		Toast.makeText(this, ""+selecteditem, Toast.LENGTH_SHORT).show();
	}

}
