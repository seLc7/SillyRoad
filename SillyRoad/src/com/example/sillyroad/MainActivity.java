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
						.setTitle("ľ��ķ")
						.setMessage(
								"ľ��ķԨԴ���������������Ļ�����������˹���Ļ���Ӱ�졣"
										+ "��ľ��ķ����Ϊ���������Ϊ�淶���ۻ���⣬���ִ�ά������У���ľ��ķ����Ҫ��˼Ϊ���ŵ����֡�"
										+ "��������" + "�鿴��ϸ��Ϣ��")
						.setPositiveButton("��",
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
						.setNegativeButton("��",
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
		 * if (event.getAction() == MotionEvent.ACTION_DOWN) { // ����Ϊ����ʱ�ı���ͼƬ
		 * v.setBackgroundResource(R.drawable.pressed_button); } else if
		 * (event.getAction() == MotionEvent.ACTION_UP) { // ��Ϊ̧��ʱ��ͼƬ
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
