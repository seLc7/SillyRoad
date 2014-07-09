package com.example.sillyroad;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class MukamuTab2 extends Activity {

	Button start, pause, resume, stop;
	VideoView video;
	Uri uri,mUri;
	int tag=0;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.mukamu_tab2);

		video = (VideoView) findViewById(R.id.mukamu_video_view);
		MediaController mController = new MediaController(this);
		mController.setAnchorView(video); // 把MediaController对象绑定到VideoView上
		video.setMediaController(mController); // 控制条
		uri = Uri.parse(Environment.getExternalStorageDirectory()
				+ "/01.mp4");
		mUri = Uri.parse("android.resource://" + getPackageName() + "/"+ R.raw.clip);
		video.setVideoURI(mUri);
		

		start = (Button) findViewById(R.id.mukamu_start_btn);
		pause = (Button) findViewById(R.id.mukamu_pause_btn);
		resume = (Button) findViewById(R.id.mukamu_resume_btn);
		stop = (Button) findViewById(R.id.mukamu_stop_btn);
	}

	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
		
		start.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				video.requestFocus();
				if(tag==0){
					video.start();
				}else{
					video.resume();
					video.start();
				}
				
				start.setEnabled(false);
				pause.setEnabled(true);
				resume.setEnabled(false);
				stop.setEnabled(true);
			}
		});

		stop.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				video.stopPlayback();
				
				stop.setEnabled(false);
				start.setEnabled(true);
				pause.setEnabled(false);
				resume.setEnabled(false);
			}
		});

		resume.setOnClickListener(new OnClickListener() { // 恢复功能为实现

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				// video.resume(); // 只是重新播放
				video.start();
				resume.setEnabled(false);
				start.setEnabled(false);
				pause.setEnabled(true);
				stop.setEnabled(true);
			}
		});

		pause.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				video.pause();
				pause.setEnabled(false);
				start.setEnabled(true);
				resume.setEnabled(true);
				stop.setEnabled(false);
			}
		});

	}

}
