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
						.setTitle("��������")
						.setMessage(
								"��ľ��ķ����ʽ�����л�������Ļ���������һλΰ���ά�����Ů��--������������Ԫ1533-1567�꣩�ܲ��ɷֵġ�1547�꣬�ᰮ���ֺ�ʫ��İ�����������Ϊ���½�ɯ��Ϊ������Ҷ��Ǽ����������")
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
