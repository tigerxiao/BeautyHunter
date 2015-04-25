package com.tigerxiao.basic;

import com.tigerxiao.beautyhunter.R;
import com.tigerxiao.extern.util.T;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class IntentTestActivity_2 extends Activity {
	private Button btn_2;
	private EditText edit_2;
	
	private String strSend = " DataActivity_2 ";
	private int requestCode = 0xff;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.intent_main_2);
		
		btn_2 = (Button)findViewById(R.id.btn_2);
		edit_2 = (EditText)findViewById(R.id.edit_2);
		
		T.showShort(getBaseContext(), "we have recv  "+getIntent().getStringExtra("name"));
		
		Bundle bundle = getIntent().getExtras();
		T.showShort(getBaseContext(), "Another msg "+bundle.getBoolean("OK"));
		
		btn_2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				//T.showShort(getBaseContext(), "btn 2");
				
				Intent i = new Intent();
				i.putExtra("Name", strSend);
				
				setResult(RESULT_OK, i);
				
				finish();
			}
		});
	}

}
