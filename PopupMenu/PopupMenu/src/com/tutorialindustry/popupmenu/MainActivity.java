package com.tutorialindustry.popupmenu;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.PopupMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        final Button btn = (Button) findViewById(R.id.popupMenuBtn);
        final PopupMenu popupMenu = new PopupMenu(this, btn);
        popupMenu.inflate(R.menu.main);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                popupMenu.show();
            }
        });
       
        popupMenu.setOnMenuItemClickListener(
                new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.menu_industry_one:
                       Toast.makeText(MainActivity.this,"Industry One", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.menu_industry_two:
                    	Toast.makeText(MainActivity.this,"Industry Two", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.menu_industry_three:
                    	Toast.makeText(MainActivity.this,"Industry Three", Toast.LENGTH_SHORT).show();
                        break;
                }
                return true;
            }
        });
 
    }
}
