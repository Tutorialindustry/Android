package com.tutorialindustry.gridviewexample;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends Activity implements OnItemClickListener {

	GridView gridView;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_main);

		initUi();
		setGridView();
		
		gridView.setOnItemClickListener(this);
	}
	private void setGridView() {

		gridView.setAdapter(new GridCustomAdapter(this));
	}
	private void initUi() {

		gridView = (GridView)findViewById(R.id.gridview);
	}
	@Override
	public void onItemClick(AdapterView<?> parent, View view, int position,
			long id) {
		Toast.makeText(MainActivity.this,GridCustomAdapter.imagesnames[position], Toast.LENGTH_SHORT).show();
	}

}
