package com.example.accesscam;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;

public class Access extends Activity {
@Override
protected void onCreate(Bundle savedInstanceState) {
  super.onCreate(savedInstanceState);
  setContentView(R.layout.activity_access);
  }
  //This method is called when we click on any button
  //and it is declare in main XML file in button tag
  //we have to pass View object in this method
  //view object has the id of button which is clicked
  public void call(View v)
  {
   Intent i=null;
   //get id from the view object and
   //perform action according to button id
   switch(v.getId())
   {
     case R.id.internet:
     //if id is internet than open net
     //use action view because we want to view the given website page
     i=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.innosen.blogspot.com"));
     startActivity(i);break;
     case R.id.fb:
     //if id is fb than open facebook
     //use action view because we want to view the given website page
     i=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.facebook.com"));
     startActivity(i);break;
    case R.id.phone:
    //if id is phone than open phone dialer
    //use action dial because we want to open phone dialer
    i=new Intent(Intent.ACTION_DIAL, Uri.parse("tel:9035361760"));
    startActivity(i);break;
    case R.id.bigb:
    //if id is bigb than call this no. +919035361760
    //use action call because we want to call on the given no.
    i=new Intent(Intent.ACTION_CALL, Uri.parse("tel:+919035361760"));
    startActivity(i);break;
    case R.id.cam:
    //if id is cam than use camera driver path to open camera
    i=new Intent("android.media.action.IMAGE_CAPTURE");
    startActivity(i);break;
   }
  }
}
