package com.seedotech.fragmentdemo;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class Fragment2 extends Fragment {

	TextView textView;
	Button button;

	OnButton2ClickedListener mListener;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState)
	{
		View view = inflater.inflate(R.layout.fragment2, container, false);
		textView = (TextView) view.findViewById(R.id.textView2);
		button = (Button) view.findViewById(R.id.button2);
		button.setOnClickListener(clickListener);
		return view;
	}

	@Override
	public void onAttach(Activity activity)
	{
		super.onAttach(activity);
		mListener = (OnButton2ClickedListener)activity;
	}


	public void setText(String text)
	{
		textView.setText(text);
	}

	public View.OnClickListener clickListener = new View.OnClickListener() {
		public void onClick(View view) {
			mListener.onButton2Clicked();
		}
	};

	public interface OnButton2ClickedListener {
		public void onButton2Clicked();
	}

}
