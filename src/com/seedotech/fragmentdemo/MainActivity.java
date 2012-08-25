package com.seedotech.fragmentdemo;

import android.os.Bundle;
import android.app.Activity;
import android.support.v4.app.FragmentActivity;
import android.view.Menu;

public class MainActivity extends FragmentActivity implements Fragment1.OnButton1ClickedListener, Fragment2.OnButton2ClickedListener
{

	Fragment1 fragment1;
	Fragment2 fragment2;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_view);

		fragment1 = (Fragment1) getSupportFragmentManager().findFragmentById(R.id.fragment1);
		fragment2 = (Fragment2) getSupportFragmentManager().findFragmentById(R.id.fragment2);

	}

	public void onButton1Clicked() {
		fragment2.setText("Button 1 Clicked");
	}

	public void onButton2Clicked() {
		fragment1.setText("Button 2 Clicked");
	}
}
