package com.tigerxiao.basic.viewgroup;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

import com.tigerxiao.beautyhunter.R;
import com.tigerxiao.extern.util.T;

public class TestBasicActivity extends Activity {

	static int progress = 0;
	ProgressBar progressBar;
	int progressStatus = 0;
	Handler handle = new Handler();
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
	
		setContentView(R.layout.basic_view_layout);
		
		
		
		Button btn = (Button) findViewById(R.id.image);
		btn.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				T.showShort(getBaseContext(),"Image Button Clicked !");
			}
		});
		
		
		progress = 0;
		progressBar = (ProgressBar) findViewById(R.id.progressBar);
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				while(progressStatus < 10){
					progressStatus = doSomeWork();
				}
				
				handle.post(new Runnable() {
					
					@Override
					public void run() {
						// TODO Auto-generated method stub
						progressBar.setVisibility(View.GONE);
					}
				});
			}
			
			private int doSomeWork(){
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				return ++progress;
			}
		}).start();
		
		
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
}
