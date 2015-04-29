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
import android.view.ViewGroup.LayoutParams;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ViewSwitcher.ViewFactory;

public class TestImageSwitch extends Activity implements ViewFactory {
	
	Integer[] imageIDs = { R.drawable.chrysanthemum, R.drawable.desert,
			R.drawable.hydrangeas, R.drawable.jellyfish, R.drawable.koala,
			R.drawable.lighthouse, R.drawable.penguins, R.drawable.tulips

	};
	
	private ImageSwitcher imageSwitcher;
	
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);

		setContentView(R.layout.image_switcher);

		imageSwitcher = (ImageSwitcher) findViewById(R.id.switch1);
		imageSwitcher.setFactory(this);
		imageSwitcher.setInAnimation(AnimationUtils.loadAnimation(this, android.R.anim.slide_in_left));
		imageSwitcher.setInAnimation(AnimationUtils.loadAnimation(this, android.R.anim.slide_out_right));
		
		
		Gallery gallery = (Gallery) findViewById(R.id.gallery2);
		gallery.setAdapter(new ImageAdapter(this));
		gallery.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				// TODO Auto-generated method stub
				T.showShort(getBaseContext(), "your choice is "+imageIDs[position]);
				
//				ImageView imageView = (ImageView) findViewById(R.id.image1);
//				imageView.setImageResource(imageIDs[position]);
				imageSwitcher.setImageResource(imageIDs[position]);
			}
		});
		
	}

	public class ImageAdapter extends BaseAdapter {
		Context context;
		int itemBackground;

		public ImageAdapter(Context c) {
			context = c;
			TypedArray a = obtainStyledAttributes(R.styleable.Gallery1);
			itemBackground = a.getResourceId(
					R.styleable.Gallery1_android_galleryItemBackground, 0);
			a.recycle();
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

				imageView.setImageResource(imageIDs[position]);
				imageView.setScaleType(ImageView.ScaleType.FIT_XY);
				imageView.setLayoutParams(new Gallery.LayoutParams(250, 220));
				imageView.setBackgroundResource(itemBackground);

			} else {
				imageView = (ImageView) convertView;
			}
			L.d("get view");
			return imageView;
		}

	}

	@Override
	public View makeView() {
		// TODO Auto-generated method stub
		ImageView imageView = new ImageView(this);
		
		imageView.setBackgroundColor(0xFF000000);
		imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setLayoutParams(new
                ImageSwitcher.LayoutParams(
                        LayoutParams.FILL_PARENT,
                        LayoutParams.FILL_PARENT));
		
		return imageView;
	}	
	
	
}
