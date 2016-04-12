package com.wtu.wziyi.cn;

import com.wtu.wziyi.cn.R;
import com.wtu.wziyi.cn.utils.ToastUtils;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

public class BaseActivity extends Activity {

	private LinearLayout parentRoot;
	/**
	 * title后退按钮
	 */
	private ImageButton titleBtnBack;
	/**
	 * title编辑按钮
	 */
	private ImageButton titleBtnEdit;
	/**
	 * title文本显示
	 */
	private TextView titleTvShow;
	/**
	 * title布局
	 */
	private LinearLayout titleLayRoot;


	public ImageButton getTitleBtnBack() {
		return titleBtnBack;
	}

	public ImageButton getTitleBtnEdit() {
		return titleBtnEdit;
	}

	public TextView getTitleTvShow() {
		return titleTvShow;
	}

	public LinearLayout getTitleLayRoot() {
		return titleLayRoot;
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		initComp(R.layout.activity_base);
	}

	private void initComp(int activityBase) {
		// TODO Auto-generated method stub
		ViewGroup group = (ViewGroup) findViewById(android.R.id.content);
		parentRoot = new LinearLayout(this);
		parentRoot.setOrientation(LinearLayout.VERTICAL);
		group.addView(parentRoot);
		View view = LayoutInflater.from(this).inflate(activityBase, parentRoot,
				true);

		titleBtnBack = (ImageButton) view.findViewById(R.id.btn_title_back);
		titleBtnEdit = (ImageButton) view.findViewById(R.id.btn_title_edit);
		titleBtnBack.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				finish();
			}
		});
		
		titleBtnEdit.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				ToastUtils.toastShort("edit");
			}
		});
		titleTvShow = (TextView) view.findViewById(R.id.tv_title_show);
		titleLayRoot = (LinearLayout) view.findViewById(R.id.root);
	}
	
	
	@Override
	public void setContentView(int layoutResID) {
		// TODO Auto-generated method stub
		LayoutInflater.from(this).inflate(layoutResID, parentRoot, true);
	}
	
	@Override
	public void setContentView(View view) {
		// TODO Auto-generated method stub
		parentRoot.addView(view);
	}
	
	@Override
	public void setContentView(View view, LayoutParams params) {
		// TODO Auto-generated method stub
		parentRoot.addView(view, params);
	}
}
