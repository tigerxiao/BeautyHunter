package com.tigerxiao.basic.fragments;

import com.tigerxiao.beautyhunter.R;
import com.tigerxiao.extern.util.T;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;

public class TestFragmentActivity extends Activity {

	private int currentFragment = 0;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.fragment_test_main);
		
	}

	public void onBtnClick(View view){
		
		//T.showShort(getBaseContext(), "Clicked .");
	
		FragmentManager fragmentManager = getFragmentManager();
		FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
		
		if(currentFragment == 0){
			
			currentFragment = 1;
			
			Fragment1 fragment1 = new Fragment1();
			fragmentTransaction.replace(R.id.fragment1, fragment1);
			
		}else if(currentFragment == 1){
			Fragment2 fragment2 = new Fragment2();
			fragmentTransaction.replace(R.id.fragment1, fragment2);
			
			currentFragment = 0;
		}
	
		fragmentTransaction.commit();
	}
	
	
	
	
}
