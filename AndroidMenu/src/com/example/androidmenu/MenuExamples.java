package com.example.androidmenu;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Color;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RelativeLayout;

public class MenuExamples extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_examples);
    }

    //This function will call when we click on menu button
    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
      //add(groupID,itemID,ItemPosition,ItemTitle)
      //setIcon(): To set icon in menu
      menu.add(0,0,3, "RED"); //.setIcon(R.drawable.icon);
      menu.add(0,1,0, "BLUE");
      menu.add(0,2,1, "GREEN");
      menu.add(0,3,2, "YELLOW");
      menu.add(0,4,8, "GRAY");
      menu.add(0,5,4, "PINK");
      menu.add(0,6,5, "WHITE");
      menu.add(0,7,7, "BLACK");
      //Maximum 6 items can display in default menu 
      //here setIcon will set icon on menu list but it will not display
      //because icon will not display in list view
      menu.add(0,8,6, "CLOSE"); //.setIcon(R.drawable.icon);
      return super.onCreateOptionsMenu(menu);
    }

    //This function will perform action when we click on menu item  
    public boolean onOptionsItemSelected(MenuItem item)
    {
      RelativeLayout rl=(RelativeLayout)findViewById(R.id.rl);
      switch(item.getItemId())
      {
   //Simply changing color of layout
      case 0: rl.setBackgroundColor(Color.RED); break;
      case 1: rl.setBackgroundColor(Color.BLUE); break;
      case 4: rl.setBackgroundColor(Color.GRAY); break;
      case 3: rl.setBackgroundColor(Color.YELLOW); break;
      case 5: rl.setBackgroundColor(Color.MAGENTA); break;
      case 6: rl.setBackgroundColor(Color.WHITE); break;
      case 2: rl.setBackgroundColor(Color.GREEN); break;
      case 8: finish(); break;
      default: rl.setBackgroundColor(Color.BLACK);  
      }
      return true;
    } 
}