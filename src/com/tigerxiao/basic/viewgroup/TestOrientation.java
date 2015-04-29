package com.tigerxiao.basic.viewgroup;

import com.tigerxiao.beautyhunter.R;
import com.tigerxiao.extern.util.L;

import android.app.Activity;
import android.os.Bundle;

public class TestOrientation extends Activity {

	//有ID的控件内容不会消失，没有ID的则会清空内容。屏幕状态发生改变时，activity会destroy掉，所以有些临时变量还是需要先保存一下的。
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.orientation);
		L.d("onCreate");
	}

	@Override
	protected void onRestoreInstanceState(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onRestoreInstanceState(savedInstanceState);
		L.d("onRestore Instance ");
	}

	@Override
	protected void onSaveInstanceState(Bundle outState) {
		// TODO Auto-generated method stub
		super.onSaveInstanceState(outState);
		L.d("onSaveInstanceState");
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		L.d("onPause");
	}

	
	
}
