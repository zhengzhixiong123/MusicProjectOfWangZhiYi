package com.wtu.wziyi.cn.actity;

import com.wtu.wziyi.cn.AppBaseActivity;
import com.wtu.wziyi.cn.R;
import com.wtu.wziyi.cn.domain.MusicMessage;
import com.wtu.wziyi.cn.utils.ToastUtils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class PlayActivity extends AppBaseActivity {

	private MusicMessage musicMessage;

	private ImageButton btnLeft;
	private ImageButton btnPlayOrPause;
	private ImageButton btnRight;

	@Override
	protected void initVariables() {
		// TODO Auto-generated method stub
		musicMessage = (MusicMessage) getIntent().getSerializableExtra("music");
		if (musicMessage != null) {
			getTitleTvShow().setText(musicMessage.getName());
		}
		getTitleLayRoot().setBackgroundColor(
				getResources().getColor(R.color.f850_default_blue));
	}

	@Override
	protected void initComp(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		setContentView(R.layout.activity_play_music);
		btnLeft = (ImageButton) findViewById(R.id.activity_play_ib_left);
		btnPlayOrPause = (ImageButton) findViewById(R.id.activity_play_ib_play_or_pause);
		btnRight = (ImageButton) findViewById(R.id.activity_play_ib_right);
		btnLeft.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				// TODO Auto-generated method stub
				left();
			}

		});

		btnPlayOrPause.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				// TODO Auto-generated method stub
				playOrPause();
			}
		});

		btnRight.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				// TODO Auto-generated method stub
				right();
			}
		});
	}

	protected void right() {
		// TODO Auto-generated method stub
		ToastUtils.toastShort("right");
	}

	protected void playOrPause() {
		// TODO Auto-generated method stub
		ToastUtils.toastShort("play or pause");
	}

	protected void left() {
		// TODO Auto-generated method stub
		ToastUtils.toastShort("left");
	}

	@Override
	protected void loadData() {
		// TODO Auto-generated method stub

	}

	public static void startPlayActivity(Context context, MusicMessage message) {
		Intent intent = new Intent(context, PlayActivity.class);
		intent.putExtra("music", message);
		context.startActivity(intent);
	}

}
