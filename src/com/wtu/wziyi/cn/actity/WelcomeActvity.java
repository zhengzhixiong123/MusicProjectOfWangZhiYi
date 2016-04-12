package com.wtu.wziyi.cn.actity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;

import com.wtu.wziyi.cn.AppBaseActivity;
import com.wtu.wziyi.cn.MainActivity;
import com.wtu.wziyi.cn.R;
import com.wtu.wziyi.cn.utils.XmlUtils;

public class WelcomeActvity extends AppBaseActivity {

	@Override
	protected void initVariables() {
		getTitleLayRoot().setVisibility(View.GONE);
	}

	@Override
	protected void initComp(Bundle savedInstanceState) {
		
		setContentView(R.layout.activity_welcome);
		new Handler().postDelayed(new Runnable() {

			public void run() {
				// TODO Auto-generated method stub
				MainActivity.startMainActivity(WelcomeActvity.this);
				finish();
				overridePendingTransition(R.anim.fade_out,R.anim.fade_in);
			}
		}, 3000);
	}

	@Override
	protected void loadData() {

	}

}
