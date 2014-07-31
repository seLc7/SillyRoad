package com.example.sillyroad;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.widget.ImageButton;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		ImageButton button1 = (ImageButton) findViewById(R.id.button1);
		button1.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				System.out.println("button1");
				new AlertDialog.Builder(MainActivity.this)
						.setTitle("木卡姆")
						.setMessage(
								"木卡姆渊源于西域土著民族文化，又深受伊斯兰文化的影响。"
										+ "“木卡姆”，为阿拉伯语，意为规范、聚会等意，在现代维吾尔语中，“木卡姆”主要意思为“古典音乐”"
										+ "…………" + "查看详细信息吗？")
						.setPositiveButton("是",
								new DialogInterface.OnClickListener() {

									@Override
									public void onClick(DialogInterface dialog,
											int i) {
										// TODO Auto-generated method stub
										Intent intent = new Intent(
												MainActivity.this,
												MukamuActivity.class);
										startActivity(intent);
									}
								})
						.setNegativeButton("否",
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
		/*
		 * infoBtn.setOnTouchListener(new OnTouchListener() {
		 * 
		 * @Override public boolean onTouch(View v, MotionEvent event) { // TODO
		 * Auto-generated method stub
		 * 
		 * if (event.getAction() == MotionEvent.ACTION_DOWN) { // 更改为按下时的背景图片
		 * v.setBackgroundResource(R.drawable.pressed_button); } else if
		 * (event.getAction() == MotionEvent.ACTION_UP) { // 改为抬起时的图片
		 * v.setBackgroundResource(R.drawable.released_button); }
		 * 
		 * return false; } });
		 */

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
