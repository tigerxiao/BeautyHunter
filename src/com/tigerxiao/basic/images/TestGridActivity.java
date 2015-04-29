package com.tigerxiao.basic.images;

import com.tigerxiao.basic.images.TestGallery.ImageAdapter;
import com.tigerxiao.beautyhunter.R;
import com.tigerxiao.extern.util.L;
import com.tigerxiao.extern.util.T;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.AdapterView.OnItemClickListener;

public class TestGridActivity extends Activity {
	Integer[] imageIDs = { R.drawable.chrysanthemum, R.drawable.desert,
			R.drawable.hydrangeas, R.drawable.jellyfish, R.drawable.koala,
			R.drawable.lighthouse, R.drawable.penguins, R.drawable.tulips

	};
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);

		setContentView(R.layout.grid_layout);

		GridView gridView = (GridView) findViewById(R.id.gridView);
		
		gridView.setAdapter(new ImageAdapter(this));
		gridView.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				// TODO Auto-generated method stub
				T.showShort(getBaseContext(), "your choice is "+imageIDs[position]);
				
				ImageView imageView = (ImageView) findViewById(R.id.image3);
				imageView.setImageResource(imageIDs[position]);
			}
		});
		
	}

	public class ImageAdapter extends BaseAdapter {
		Context context;

		public ImageAdapter(Context c) {
			context = c;
		}

		@Override
		public int getCount() {
			// TODO Auto-generated method stub
			L.d("get count");
			return imageIDs.length;
		}

		@Override
		public Object getItem(int position) {
			// TODO Auto-generated method stub
			L.d("get position");
			return position;
		}

		@Override
		public long getItemId(int position) {
			// TODO Auto-generated method stub
			L.d("get  item id");
			return position;
		}

		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			// TODO Auto-generated method stub
			ImageView imageView;

			if (convertView == null) {
				imageView = new ImageView(context);

				imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
				imageView.setLayoutParams(new GridView.LayoutParams(85, 85));
				imageView.setPadding(5, 5, 5, 5);

			} else {
				imageView = (ImageView) convertView;
			}
			imageView.setImageResource(imageIDs[position]);
			return imageView;
		}

	}	
	
	
	
}
