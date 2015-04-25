package com.tigerxiao.basic.activity;

import com.tigerxiao.beautyhunter.R;
import com.tigerxiao.beautyhunter.R.layout;
import com.tigerxiao.extern.util.L;

import android.app.Activity;
import android.os.Bundle;

public class ActivityLifeCycle extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		L.i("onCreate");
	}

	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
		L.d("onStart");
	}

	@Override
	protected void onRestart() {
		// TODO Auto-generated method stub
		super.onRestart();
		L.d("onRestart");
	}

	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		L.d("onResume");
	}

	@Override
	protected void onSaveInstanceState(Bundle outState) {
		// TODO Auto-generated method stub
		super.onSaveInstanceState(outState);
		L.d("onSave");
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		L.d("onPause");
	}

	@Override
	protected void onStop() {
		// TODO Auto-generated method stub
		super.onStop();
		L.d("onStop");
	}

	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		L.d("onDestroy");
	}


	
	
}
