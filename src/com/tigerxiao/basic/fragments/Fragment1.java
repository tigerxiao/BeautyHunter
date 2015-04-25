package com.tigerxiao.basic.fragments;

import com.tigerxiao.beautyhunter.R;
import com.tigerxiao.extern.util.L;
import com.tigerxiao.extern.util.T;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class Fragment1 extends Fragment {

	private EditText txt;
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
	//	return super.onCreateView(inflater, container, savedInstanceState);
	
		return inflater.inflate(R.layout.fragment_test_1, container,false);
	}

	public void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
		L.d("Start");
		
		Button button = (Button) getActivity().findViewById(R.id.btn_get_main_fragment);
		
		button.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				txt = (EditText) getActivity().findViewById(R.id.fragment);
				T.showShort(getActivity().getBaseContext(),"Fragment 1 get main Fragment content :"+ txt.getText());
			}
		});
	
	}
	
	
	
	
	

	@Override
	public void onAttach(Activity activity) {
		// TODO Auto-generated method stub
		super.onAttach(activity);
		L.d("Attach");
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		L.d("Create");
	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onActivityCreated(savedInstanceState);
		L.d("Create");
	}


	@Override
	public void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		L.d("Resume");
	}

	@Override
	public void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		L.d("Pause");
	}

	@Override
	public void onStop() {
		// TODO Auto-generated method stub
		super.onStop();
		L.d("Stop");
	}

	@Override
	public void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		L.d("Destroy");
	}

	@Override
	public void onDetach() {
		// TODO Auto-generated method stub
		super.onDetach();
		L.d("Detach");
	}


	
	
	
}

