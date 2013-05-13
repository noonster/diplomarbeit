package com.example.htlweiz;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class EfficientAdapter extends BaseAdapter {
	private Activity activity;
	private ArrayList<Post> data;
	private static LayoutInflater inflater = null;
	// public ImageLoader imageLoader;
	ViewHolder holder;

	EfficientAdapter(Activity a, ArrayList<Post> d) {

		activity = a;
		data = d;
		inflater = (LayoutInflater) activity
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		// imageLoader = new ImageLoader(activity.getApplicationContext());

	}

	@Override
	public int getCount() {
		return data.toArray().length;

	}

	@Override
	public Object getItem(int position) {
		
		return data.get(position);
	}

	@Override
	public long getItemId(int position) {
		//TODO: is there a better choice
		return Long.parseLong(data.get(position).getGuid());
	}

	public static class ViewHolder {
		public TextView label;
		public TextView addr;
		public ImageView image;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		View vi = convertView;

		if (convertView == null) {
			vi = inflater.inflate(R.layout.row, null);
			holder = new ViewHolder();
			holder.label = (TextView) vi.findViewById(R.id.title);
			holder.addr = (TextView) vi.findViewById(R.id.details);
			holder.image = (ImageView) vi.findViewById(R.id.thumb);
			vi.setTag(holder);
		} else
			holder = (ViewHolder) vi.getTag();

		holder.label.setText(data.get(position).getTitle());
		holder.addr.setText(data.get(position).getPubDate());

		// imageLoader.DisplayImage((data.get(position).getThumbnail()),
		// activity,
		// holder.image, 72, 72);
		URL url = null;
		try {
			url = new URL((data.get(position).getUrl()));
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		InputStream content = null;
		try {
			content = (InputStream) url.getContent();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		Drawable d = Drawable.createFromStream(content, "src");
		Bitmap mIcon1 = null;
		try {
			mIcon1 = BitmapFactory.decodeStream(url.openConnection()
					.getInputStream());
		} catch (IOException e) {
			e.printStackTrace();
		}
		holder.image.setImageBitmap(Bitmap.createScaledBitmap(mIcon1, 72, 72,
				false));

		return vi;
	}

}