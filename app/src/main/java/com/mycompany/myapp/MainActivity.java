package com.mycompany.myapp;

import android.app.*;
import android.os.*;
import android.widget.*;
import android.view.ContextMenu.*;
import android.view.*;
import android.graphics.*;

public class MainActivity extends Activity 
{
	
	TextView tvColor;
	TextView tvSize;
	
	final int MENU_COLOR_RED = 1;
	final int MENU_COLOR_GREEN = 2;
	final int MENU_COLOR_BLUE = 3;
	
	final int MENU_SIZE_22 = 4;
	final int MENU_SIZE_26 = 5;
	final int MENU_SIZE_30 = 6;
	
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		tvColor = (TextView) findViewById(R.id.tvColor);
		tvSize = (TextView) findViewById(R.id.tvSize);
		
		registerForContextMenu(tvColor);
		registerForContextMenu(tvSize);
		
    }

	@Override
	public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo)
	{
		switch(v.getId()){
			
			case R.id.tvColor:
				menu.add(0, MENU_COLOR_RED, 0, "red");
				menu.add(0, MENU_COLOR_GREEN, 0, "green");
				menu.add(0, MENU_COLOR_BLUE, 0, "blue");
				break;
				
			case R.id.tvSize:
				menu.add(0, MENU_SIZE_22, 0, "22");
				menu.add(0, MENU_SIZE_26, 0, "26");
				menu.add(0, MENU_SIZE_30, 0, "30");
				break;
		}
		
	}

	@Override
	public boolean onContextItemSelected(MenuItem item)
	{
		// TODO: Implement this method
		
		switch (item.getItemId()){
			
			case MENU_COLOR_RED:
				tvColor.setTextColor(Color.RED);
				tvColor.setText("Text color = red");
				break;
				
			case MENU_COLOR_GREEN:
				tvColor.setTextColor(Color.GREEN);
				tvColor.setText("Text color = green");
				break;
				
			case MENU_COLOR_BLUE:
				tvColor.setTextColor(Color.BLUE);
				tvColor.setText("Text color = blue");
				break;
				
			case MENU_SIZE_22:
				tvColor.setTextSize(22);
				tvColor.setText("Text size = 22");
				break;
				
			case MENU_SIZE_26:
				tvColor.setTextSize(26);
				tvColor.setText("Text size = 26");
				break;
				
			case MENU_SIZE_30:
				tvColor.setTextSize(30);
				tvColor.setText("Text size = 30");
				break;
			
		}
		return super.onContextItemSelected(item);
	}
	
	
	
	
}
