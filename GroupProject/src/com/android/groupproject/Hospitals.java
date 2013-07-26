package com.android.groupproject;

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
    
    TextView hospitalInfoTxt = (TextView) findViewById(R.id.hospitalInfo);    
	  TextView bayMedicalTxt = (TextView) findViewById(R.id.bayMedicalCenter);
	  TextView gulfCoastTxt = (TextView) findViewById(R.id.gulfCoastMedicalCenter);
	  Typeface externalFont = Typeface.createFromAsset(getAssets(), "fonts/CONSOLA.TTF");
	  hospitalInfoTxt.setTypeface(externalFont);
	  bayMedicalTxt.setTypeface(externalFont);
	  gulfCoastTxt.setTypeface(externalFont);
  }

  @Override
  public boolean onCreateOptionsMenu(Menu menu)
  {
    // Inflate the menu; this adds items to the action bar if it is present.
    getMenuInflater().inflate(R.menu.hospitals, menu);
    return true;
  }

}