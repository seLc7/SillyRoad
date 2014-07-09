package com.example.sillyroad;

import android.app.Activity;
import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;

public class MukamuActivity extends TabActivity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		// setContentView(R.layout.main);
		final TabHost tabHost = getTabHost();
		tabHost.addTab(tabHost
				.newTabSpec("Tab1")
				.setIndicator("简介",
						getResources().getDrawable(R.drawable.ic_info))
				.setContent(new Intent(this, MukamuTab1.class)));
		tabHost.addTab(tabHost
				.newTabSpec("Tab2")
				.setIndicator("视频",
						getResources().getDrawable(R.drawable.ic_video))
				.setContent(new Intent(this, MukamuTab2.class)));
		// .addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)));
		// //添加这句话，会使得每次跳转到该页面都是新建一个页面，以往的数据状态会丢失
		tabHost.addTab(tabHost
				.newTabSpec("Tab3")
				.setIndicator("寓意",
						getResources().getDrawable(R.drawable.ic_meaning))
				.setContent(new Intent(this, MukamuTab3.class)));
		tabHost.addTab(tabHost
				.newTabSpec("Tab3")
				.setIndicator("图片",
						getResources().getDrawable(R.drawable.ic_picture))
				.setContent(new Intent(this, MukamuTab4.class)));
	}
}
