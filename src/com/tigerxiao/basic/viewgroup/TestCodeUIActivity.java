package com.tigerxiao.basic.viewgroup;

import com.tigerxiao.extern.util.T;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

public class TestCodeUIActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);

	//create params
	LayoutParams layoutParams = new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT,LayoutParams.WRAP_CONTENT);
	 
	//create a layout
	LinearLayout layout = new LinearLayout(this);
	layout.setOrientation(LinearLayout.VERTICAL);
	
	//create edittext
	EditText editText = new EditText(this);
	editText.setHint("这是文本框");
	editText.setLayoutParams(layoutParams);
	
	Button button = new Button(this);
	button.setText("这是一个按钮");
	button.setLayoutParams(layoutParams);
	
	layout.addView(editText);
	layout.addView(button);
	
	this.addContentView(layout, layoutParams);
	}

	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		// TODO Auto-generated method stub
		
		T.showShort(this, "keyCode  "+keyCode+"  event"+event.toString());
		
		return super.onKeyDown(keyCode, event);
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
