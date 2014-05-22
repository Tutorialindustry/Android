package com.tutorialindustry.optionsmenu;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
     public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
        case R.id.item1:
          Toast.makeText(this, "Tutorial 1 Selected", Toast.LENGTH_SHORT).show();
          return true;
        case R.id.item2:
          Toast.makeText(this, "Tutorial 2 Selected", Toast.LENGTH_SHORT).show();
          return true;
        case R.id.item3:
          Toast.makeText(this, "Tutorial 3 Selected", Toast.LENGTH_SHORT).show();
          return true;           
        case R.id.item4:
          Toast.makeText(this, "Tutorial 4 Selected", Toast.LENGTH_SHORT).show();
          return true;
        case R.id.item5:
          Toast.makeText(this, "Tutorial 5 Selected", Toast.LENGTH_SHORT).show();
          return true;          
        default:
          return super.onOptionsItemSelected(item);
        } 
    } 
}
