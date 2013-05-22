package com.example.htlweiz;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;

import android.app.Activity;
import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ListView;

public class News extends Activity {
	static final String feed = "http://feeds.feedburner.com/theappleblog";
	/** Called when the activity is first created. */
	ListView lv1;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_news);
		lv1 = (ListView) findViewById(R.id.listView666);

		try {
			new LoadingTask().execute(new URL(feed));
		} catch (MalformedURLException e) {
			this.finish();
		}

	}

	class LoadingTask extends AsyncTask<URL, Void, ArrayList<Post>> {

		ProgressDialog ShowProgress;

		@Override
		protected void onPreExecute() {
			ShowProgress = ProgressDialog.show(News.this, "",
					"Loading. Please wait...", true);
		}

		protected ArrayList<Post> doInBackground(URL... urls) {
			RSSHandler rh = new RSSHandler();
			SAXHelper sh = new SAXHelper(urls[0], rh);
			sh.parseContent();
			return rh.getPostList();

		}

		protected void onPostExecute(ArrayList<Post> pl) {
			lv1.setAdapter(new EfficientAdapter(News.this, pl));
//			lv1.setOnItemClickListener(new OnItemClickListener() {
//				public void onItemClick(AdapterView<?> parent, View view,
//						int position, long id) {
//
//					Intent intent = new Intent(Intent.ACTION_VIEW).setData(Uri
//							.parse(PostList.get(position).getUrl()));
//					startActivity(intent);
//
//				}
//			});
			ShowProgress.dismiss();

		}
	}

	class SAXHelper {
		public HashMap<String, String> userList = new HashMap<String, String>();
		private URL url;
		private DefaultHandler df;

		public SAXHelper(URL url, DefaultHandler df) {
			this.url = url;
			this.df = df;
		}

		public void parseContent() {
			try {

				SAXParserFactory spf = SAXParserFactory.newInstance();
				SAXParser sp = spf.newSAXParser();
				XMLReader xr = sp.getXMLReader();
				xr.setContentHandler(df);
				xr.parse(new InputSource(url.openStream()));
			} catch (Exception e) {
				//TODO
				e.printStackTrace();
			}
		}
	}

	class RSSHandler extends DefaultHandler {
		public ArrayList<Post> postList = new ArrayList<Post>();
		private Post currentPost = null;
		private StringBuffer chars = null;

		@Override
		public void startElement(String uri, String localName, String qName,
				Attributes atts) {

			
			if (localName.equalsIgnoreCase("item")) {
				currentPost = new Post();
			} else
				// this is a waste but will work
				chars = new StringBuffer();
		}

		@Override
		public void endElement(String uri, String localName, String qName)
				throws SAXException {

			// we're only interested once inside an item element
			if (currentPost == null)
				return;
						
					
			if (localName.equalsIgnoreCase("title")
					&& currentPost.getTitle() == null) {
				currentPost.setTitle(chars.toString());

			}
			if (localName.equalsIgnoreCase("pubDate")
					&& currentPost.getPubDate() == null) {
				currentPost.setPubDate(chars.toString());

			}
			if (localName.equalsIgnoreCase("guid")
					&& currentPost.getGuid() == null) {
				currentPost.setGuid(chars.toString());

			}
			if (localName.equalsIgnoreCase("thumbnail")
					&& currentPost.getThumbnail() == null) {
				currentPost.setThumbnail(chars.toString());

			}
			if (localName.equalsIgnoreCase("link")
					&& currentPost.getUrl() == null) {
				currentPost.setUrl(chars.toString());
			}

			if (localName.equalsIgnoreCase("item")) {
				postList.add(currentPost);
				currentPost = null;
			}

		}

		@Override
		public void characters(char ch[], int start, int length) {
			chars.append(new String(ch, start, length));
		}

		public ArrayList<Post> getPostList() {
			return postList;
		}

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.news, menu);
		return true;
	}

}
