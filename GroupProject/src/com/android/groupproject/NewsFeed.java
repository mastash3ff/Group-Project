package com.android.groupproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import java.net.URL;
import org.xml.sax.InputSource;
import org.xml.sax.XMLReader;
import java.io.IOException;
import org.xml.sax.SAXException;
import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

import com.android.groupproject.R;

public class NewsFeed extends Activity {



	// Called when the activity is first created. 
	
	String rssResult = "";
	boolean item = false;

	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		/*
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_news_feed);

		Button buttonPrevious = (Button) findViewById(R.id.ButtonPrevious);
		buttonPrevious.setOnClickListener(new View.OnClickListener() 
		{
			public void onClick(View view) 
			{
				Intent intent = new Intent();
				setResult(RESULT_OK, intent);
				finish();
			}

		});
	 */
	/*

		TextView rss = (TextView) findViewById(R.id.textViewNews);
		try {
			URL rssUrl = new URL("http://www.javaworld.com/index.xml");
			SAXParserFactory factory = SAXParserFactory.newInstance();
			SAXParser saxParser = factory.newSAXParser();
			XMLReader xmlReader = saxParser.getXMLReader();
			RSSHandler rssHandler = new RSSHandler();
			xmlReader.setContentHandler(rssHandler);
			InputSource inputSource = new InputSource(rssUrl.openStream());
			xmlReader.parse(inputSource);

		} 
		catch (IOException e) {rss.setText(e.getMessage());
		} 
		catch (SAXException e) {rss.setText(e.getMessage());
		} 
		catch (ParserConfigurationException e) {rss.setText(e.getMessage());
		}

		rss.setText(rssResult);
	}

	private class RSSHandler extends DefaultHandler
	{

		public void startElement(String uri, String localName, String qName,
				Attributes attrs) throws SAXException {
			if (localName.equals("item"))
				item = true;

			if (!localName.equals("item") && item == true)
				rssResult = rssResult + localName + ": ";

		}

		public void endElement(String namespaceURI, String localName,
				String qName) throws SAXException
				{

				}

		public void characters(char[] ch, int start, int length)
				throws SAXException 
				{
			String cdata = new String(ch, start, length);
			if (item == true)
				rssResult = rssResult +(cdata.trim()).replaceAll("\\s+", " ")+"\t";

				}
	 */
}

}