package com.tigerxiao.basic;

import com.tigerxiao.beautyhunter.R;
import com.tigerxiao.extern.util.L;
import com.tigerxiao.extern.util.T;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

public class CreateDialog extends Activity {
	
	private CharSequence[] items = {"Tiger","Wolf","Cat"};
	private boolean[]	itemsChecked = new boolean[items.length];
	Button btn_2;
	Button progress_btn;
	ProgressDialog progressDialog;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.dialog_main);
		
		btn_2 = (Button)findViewById(R.id.btn_2);
		btn_2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				T.showShort(getBaseContext(), "btn_2 btn clicked");
			}
		});
	}

	@SuppressWarnings("deprecation")
	public void onClick(View v){
		showDialog(0);
	}

	public void onClickProgress(View v){
		showDialog(1);
	}
	
	public void onClickProgressRunning(View v){
		showDialog(2);
		
		progressDialog.setProgress(0);
		progressDialog.setMax(100);
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				for(int i = 1; i <= 10; i++ ){
					try {
						Thread.sleep(1000);
						progressDialog.incrementProgressBy(10);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				progressDialog.dismiss();
			}
		}).start();
		
	}
	
	
	
	@SuppressWarnings("deprecation")
	protected Dialog onCreateDialog(int id){
		switch(id){
		case 0:
			return new AlertDialog.Builder(this)
			.setIcon(R.drawable.ic_launcher)
			.setTitle("Alert Dialog")
			.setPositiveButton("OK", new DialogInterface.OnClickListener() {
				
				@Override
				public void onClick(DialogInterface dialog, int which) {
					// TODO Auto-generated method stub
					T.showShort(getBaseContext(), "OK , Click ");
				}
			})
			.setMultiChoiceItems(items, itemsChecked, new DialogInterface.OnMultiChoiceClickListener() {
				
				@Override
				public void onClick(DialogInterface dialog, int which, boolean isChecked) {
					// TODO Auto-generated method stub
					T.showShort(getBaseContext(), items[which]+(isChecked ? " Checked" : "unChecked"));
				}
			})
			.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
				
				@Override
				public void onClick(DialogInterface dialog, int which) {
					// TODO Auto-generated method stub
					T.showShort(getBaseContext(), "Cancel , Click ");
				}
			}).create();
			
		case 1:
			final ProgressDialog dialog = ProgressDialog.show(this, "Progress Dialog", "Dialog Content", true);
			new Thread(new Runnable() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					try{
						Thread.sleep(5000);
						dialog.dismiss();
					}catch(InterruptedException e){
						e.printStackTrace();
					}
				}
			}).start();
			
		case 2:
			progressDialog = new ProgressDialog(this);
			progressDialog.setIcon(R.drawable.ic_launcher);
			progressDialog.setTitle("Progress Dialog");
			progressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
			progressDialog.setButton(DialogInterface.BUTTON_POSITIVE,"OK", new DialogInterface.OnClickListener() {
				
				@Override
				public void onClick(DialogInterface dialog, int which) {
					// TODO Auto-generated method stub
					T.showShort(getBaseContext(), "Ok Clicked");
				}
			});
			progressDialog.setButton(DialogInterface.BUTTON_NEGATIVE,"Cancel", new DialogInterface.OnClickListener() {
				
				@Override
				public void onClick(DialogInterface dialog, int which) {
					// TODO Auto-generated method stub
					T.showShort(getBaseContext(), "Cancel Clicked");
				}
			});
			return progressDialog;
		}
		
		return null;
	} 
	
	
	
	
	
}
