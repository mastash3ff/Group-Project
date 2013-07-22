package com.example.groupproject;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.webkit.WebView;

public class Shopping extends Activity
{

  @Override
  protected void onCreate(Bundle savedInstanceState)
  {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_shopping);
    WebView webView = new WebView(getApplicationContext());
    setContentView(webView);
    webView.loadUrl("http://www.visitpanamacitybeach.com/things-to-do/shopping/");
  }

  @Override
  public boolean onCreateOptionsMenu(Menu menu)
  {
    // Inflate the menu; this adds items to the action bar if it is present.
    getMenuInflater().inflate(R.menu.shopping, menu);
    return true;
  }

}
