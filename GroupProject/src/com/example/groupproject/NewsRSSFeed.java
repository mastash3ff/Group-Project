package com.example.groupproject;

import android.app.Activity;
import android.os.Bundle;
import java.util.Stack;

import android.view.Menu;
import android.widget.TextView;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.util.StringTokenizer;

import java.net.MalformedURLException;
import java.net.URL;
import org.xml.sax.InputSource;
import org.xml.sax.XMLReader;
import java.io.IOException;
import org.xml.sax.SAXException;
import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class NewsRSSFeed extends Activity
{
  /** Called when the activity is first created. */
  String rssResult = "";
  boolean item = false;

  @Override
  protected void onCreate(Bundle savedInstanceState)
  {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_news_rssfeed);
    TextView rss = (TextView) findViewById(R.id.rss);
    try
    {
        URL rssUrl = new URL("http://www.javaworld.com/index.xml");
        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser saxParser = factory.newSAXParser();
        XMLReader xmlReader = saxParser.getXMLReader();
        RSSHandler rssHandler = new RSSHandler();
        xmlReader.setContentHandler(rssHandler);
        InputSource inputSource = new InputSource(rssUrl.openStream());
        xmlReader.parse(inputSource);

    }
    catch (IOException e)
    {
      rss.setText(e.getMessage());
    }
    catch (SAXException e)
    {
      rss.setText(e.getMessage());
    }
    catch (ParserConfigurationException e)
    {
      rss.setText(e.getMessage());
    }
    rss.setText(rssResult);
  }

  @Override
  public boolean onCreateOptionsMenu(Menu menu)
  {
    // Inflate the menu; this adds items to the action bar if it is present.
    getMenuInflater().inflate(R.menu.news_rssfeed, menu);
    return true;
  }

}