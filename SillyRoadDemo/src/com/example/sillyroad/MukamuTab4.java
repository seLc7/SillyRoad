package com.example.sillyroad;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;

public class MukamuTab4 extends Activity {

	ImageButton imageBtn1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.mukamu_tab4);

		imageBtn1 = (ImageButton) findViewById(R.id.mukamu_image_button01);

	}

	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
		imageBtn1.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				new AlertDialog.Builder(MukamuTab4.this)
						.setTitle("阿曼尼萨")
						.setMessage(
								"“木卡姆”正式纳入中华民族的文化宝库是与一位伟大的维吾尔族女性--阿曼尼萨（公元1533-1567年）密不可分的。1547年，酷爱音乐和诗歌的阿曼尼萨，成为以新疆莎车为国都的叶尔羌汗国的王后。")
						.setNeutralButton("OK",
								new DialogInterface.OnClickListener() {

									@Override
									public void onClick(DialogInterface dialog,
											int i) {
										// TODO Auto-generated method stub
										dialog.dismiss();
									}
								}).show();
			}
		});
	}
}
