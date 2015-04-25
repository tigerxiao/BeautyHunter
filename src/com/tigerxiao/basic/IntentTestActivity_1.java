package com.tigerxiao.basic;

import java.net.URL;

import com.tigerxiao.beautyhunter.R;
import com.tigerxiao.extern.util.L;
import com.tigerxiao.extern.util.T;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class IntentTestActivity_1 extends Activity {

	Button btn_1;
	EditText edit_1;
	
	private String strSend = " DataActivity_1 ";
	private int requestCode = 0xff;
	
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.intent_main_1);

		btn_1 = (Button) findViewById(R.id.btn_1);
		edit_1 = (EditText) findViewById(R.id.edit_1);
		
		btn_1.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				T.showShort(getBaseContext(), "btn 1 clicked");
				
				//startActivity(new Intent("com.tigerxiao.basic.IntentTestActivity_2"));
				Intent intent = new Intent("com.tigerxiao.basic.IntentTestActivity_2");
				
				intent.putExtra("name", strSend);
				
				Bundle bundle = new Bundle();
				bundle.putBoolean("OK", true);
				
				intent.putExtra("Bundle", bundle);
				
				startActivityForResult(intent, requestCode);
			}
		});
	}

	//启动的第二个Activity退出后，下面这个函数就会被调用了
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		// TODO Auto-generated method stub
		super.onActivityResult(requestCode, resultCode, data);
		
		if(requestCode == this.requestCode){
			
			T.showShort(getBaseContext(), "Activity1 recv :  "+data.getStringExtra("Name"));
		}
	}

	
	
	
	
}
