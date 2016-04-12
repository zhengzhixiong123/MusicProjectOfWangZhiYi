package com.wtu.wziyi.cn;


import android.os.Bundle;

public abstract class AppBaseActivity extends BaseActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		initVariables();
		initComp(savedInstanceState);
		loadData();
	}

	/**
	 * 初始化变量
	 */
	protected abstract void initVariables() ;
	/**
	 * 初始化组件
	 */
	protected abstract void initComp(Bundle savedInstanceState) ;
	/**
	 * 加载数据
	 */
	protected abstract void loadData() ;
}
