package com.wtu.wziyi.cn.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

public abstract class AppBaseAdapter extends BaseAdapter {

	public abstract int getCount() ;

	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return null;
	}

	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return 0;
	}

	public abstract View getView(int position, View convertView, ViewGroup parent) ;

}
