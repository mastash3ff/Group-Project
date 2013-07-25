package com.example.groupproject;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Typeface;
import android.view.Menu;
import android.widget.TextView;

public class Hospitals extends Activity
{

  @Override
  protected void onCreate(Bundle savedInstanceState)
  {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_hospitals);
    
	TextView txtView1 = (TextView) findViewById(R.id.bayMedicalCenter);
	TextView txtView2 = (TextView) findViewById(R.id.gulfCoastMedicalCenter);
	Typeface externalFont = Typeface.createFromAsset(getAssets(),
			"fonts/CONSOLA.TTF");
	txtView1.setTypeface(externalFont);
	txtView2.setTypeface(externalFont);
	
  }

  @Override
  public boolean onCreateOptionsMenu(Menu menu)
  {
    // Inflate the menu; this adds items to the action bar if it is present.
    getMenuInflater().inflate(R.menu.hospitals, menu);
    return true;
  }

}