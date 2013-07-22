package com.example.groupproject;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.webkit.WebView;

public class Hotels extends Activity
{

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_hotels);

		//	Intent intent = new Intent(android.content.Intent.ACTION_VIEW, 
		//			Uri.parse("http://goo.gl/maps/9y6JV"));
		//startActivity(intent);

		    WebView webView = new WebView(getApplicationContext());
		    setContentView(webView);
		    webView.loadUrl("http://goo.gl/maps/9y6JV");

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.hotels, menu);
		return true;
	}

}