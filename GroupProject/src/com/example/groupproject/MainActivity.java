package com.example.groupproject;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MainActivity extends Activity {
	
	/**  Guide Lines and ideas*/
	
	//create listener buttons for categories - about 5 categories
	  //possibly spawn new activities as a result from button clicks to open more selections
	
	//add google maps for locations; all else fails, open web page to google map location.
	
	//add simple animations?
	
	//link to web pages for information
	  //Entertainment - http://www.marinaciviccenter.com/
						//http://www.martintheatre.com/
						//http://www.vac.org.cn/home.html
	
	//main source for visitor information:  http://www.pcgov.org/visitors
	
	//various button categories that open more selections ( see document for categories.)  Possibly add 'about' section?

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
