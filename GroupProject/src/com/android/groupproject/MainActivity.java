package com.android.groupproject;

import com.android.rss.ITCutiesReaderAppActivity;
import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity
{
	private Button entertainmentBtn,
	newsBtn,
	hotelsBtn,
	hospitalsBtn,
	restaurantsBtn,
	shoppingBtn;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		entertainmentBtn = (Button) findViewById(R.id.entertainment);
		entertainmentBtn.setOnClickListener(entertainmentListener);

		newsBtn = (Button) findViewById(R.id.news);
		newsBtn.setOnClickListener(newsListener);

		hotelsBtn = (Button) findViewById(R.id.hotels);
		hotelsBtn.setOnClickListener(hotelsListener);

		hospitalsBtn = (Button) findViewById(R.id.hospitals);
		hospitalsBtn.setOnClickListener(hospitalsListener);

		restaurantsBtn = (Button) findViewById(R.id.restaurants);
		restaurantsBtn.setOnClickListener(restaurantsListener);

		shoppingBtn = (Button) findViewById(R.id.shopping);
		shoppingBtn.setOnClickListener(shoppingListener);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	OnClickListener entertainmentListener = new OnClickListener()
	{
		public void onClick(View v)
		{
			Intent intent = new Intent(android.content.Intent.ACTION_VIEW, 
					Uri.parse("http://www.newsherald.com/entertainment"));
			startActivity(intent);
		}
	};

	OnClickListener newsListener = new OnClickListener()
	{
		public void onClick(View v)
		{
			Intent myIntent = new Intent(getApplicationContext(), ITCutiesReaderAppActivity.class);
			startActivity(myIntent);
		}
	};

	OnClickListener hotelsListener = new OnClickListener()
	{
		public void onClick(View v)
		{
			Intent intent = new Intent(android.content.Intent.ACTION_VIEW, 
					Uri.parse("https://maps.google.com/maps?q=panama+city+beach+hotels&hl=en&sll=30.234861,-85.845579&sspn=0.252423,0.528374&hq=hotels&hnear=Panama+City+Beach,+Bay,+Florida&t=m&z=13"));
			startActivity(intent);
		}
	};

	OnClickListener hospitalsListener = new OnClickListener()
	{
		public void onClick(View v)
		{
			Intent intent = new Intent(getApplicationContext(), Hospitals.class);
			startActivity(intent);
		}
	};

	OnClickListener restaurantsListener = new OnClickListener()
	{
		public void onClick(View v)
		{
			Intent intent = new Intent(android.content.Intent.ACTION_VIEW, 
					Uri.parse("https://maps.google.com/maps?q=panama+city+beach+restaurants&hl=en&sll=30.20672,-85.838209&sspn=0.252495,0.528374&hq=restaurants&hnear=Panama+City+Beach,+Bay,+Florida&t=m&z=12"));
			startActivity(intent);
		}
	};

	OnClickListener shoppingListener = new OnClickListener()
	{
		public void onClick(View v)
		{
			Intent intent = new Intent(android.content.Intent.ACTION_VIEW, 
					Uri.parse("http://www.visitpanamacitybeach.com/things-to-do/shopping/"));
			startActivity(intent);
		}
	};

}
