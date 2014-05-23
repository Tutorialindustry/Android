package com.tutorialindustry.contextmenu;

import android.app.Activity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {
	 /** Called when the activity is first created. */
	 @Override
	 public void onCreate(Bundle savedInstanceState) {
	  super.onCreate(savedInstanceState);
	  setContentView(R.layout.activity_main);

	  Button btn = (Button) findViewById(R.id.longpresse_button);
	  registerForContextMenu(btn);
	 }
	 @Override
	 public void onCreateContextMenu(ContextMenu menu, View v,
	   ContextMenuInfo menuInfo) {
	  super.onCreateContextMenu(menu, v, menuInfo);
	  menu.setHeaderTitle("Context Menu Window");
	  menu.add(0, v.getId(), 0, "Context 1");
	  menu.add(0, v.getId(), 0, "Context 2");
	  menu.add(0, v.getId(), 0, "Context 3");
	 }
	 @Override
	 public boolean onContextItemSelected(MenuItem item) {
	  if (item.getTitle() == "Context 1") {
	   Toast.makeText(this, "Context 1 Selected", Toast.LENGTH_SHORT).show();
	  } else if (item.getTitle() == "Context 2") {
	   Toast.makeText(this, "Context 2 Selected", Toast.LENGTH_SHORT).show();
	  } else if (item.getTitle() == "Context 3") {
	   Toast.makeText(this, "Context 3 Selected", Toast.LENGTH_SHORT).show();
	  } else {
	   return false;
	  }
	  return true;
	 }

	}