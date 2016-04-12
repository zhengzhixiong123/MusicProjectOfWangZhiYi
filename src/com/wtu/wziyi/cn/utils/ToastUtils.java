package com.wtu.wziyi.cn.utils;

import com.wtu.wziyi.cn.app.AppCotext;

import android.widget.Toast;

public class ToastUtils {

	public static void toastShort(String content){
		Toast.makeText(AppCotext.getContext(), content, Toast.LENGTH_SHORT).show();
	}
	
	public static void toastLong(String content){
		Toast.makeText(AppCotext.getContext(), content, Toast.LENGTH_LONG).show();
	}
	
}
