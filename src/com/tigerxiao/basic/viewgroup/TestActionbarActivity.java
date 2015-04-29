package com.tigerxiao.basic.viewgroup;

import com.tigerxiao.beautyhunter.R;
import com.tigerxiao.extern.util.L;
import com.tigerxiao.extern.util.T;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class TestActionbarActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		L.d("onCreate TestActionbarActivity");
		setContentView(R.layout.orientation);
		
		ActionBar actionBar = getActionBar();
		actionBar.show();
		actionBar.setDisplayHomeAsUpEnabled(true);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// TODO Auto-generated method stub
		super.onCreateOptionsMenu(menu);
		T.showShort(this,"onCreateOptionMenu");
		return CreateMenu(menu);
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
		L.d("onOptionsItemSelected ");
		return MenuChoice(item);
	}

	private boolean CreateMenu(Menu menu){
		
		int i = 0;
		
		for(i = 0; i < 5; i++){
			
			MenuItem item = menu.add(0, i, 0, "Item "+i);
			item.setIcon(R.drawable.abc_ic_go);
			item.setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM | MenuItem.SHOW_AS_ACTION_WITH_TEXT);
		}
		
		return true;
	}
	
	private boolean MenuChoice(MenuItem item){
		
		if(item.getItemId() == android.R.id.home){
			T.showShort(this, "你点击了图标!!!");
		}else{
			T.showShort(this, "You have click "+item.getItemId());
		}
			
		
		return true;
	}
	
	
	
	
	
	
}
