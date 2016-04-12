package com.wtu.wziyi.cn.actity;

import android.os.Bundle;

import com.wtu.wziyi.cn.AppBaseActivity;
import com.wtu.wziyi.cn.R;

public class SetActivity extends AppBaseActivity{

	@Override
	protected void initVariables() {
		// TODO Auto-generated method stub
		getTitleTvShow().setText("设置");
	}

	@Override
	protected void initComp(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		setContentView(R.layout.activity_set);
	}

	@Override
	protected void loadData() {
		// TODO Auto-generated method stub
		
	}



}
