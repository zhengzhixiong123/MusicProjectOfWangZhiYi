package com.wtu.wziyi.cn.app;

import android.app.Application;
import android.content.Context;

public class AppCotext extends Application {
	
	private static Context mcContext;

	public static Context getContext() {
		return mcContext;
	}

	@Override
	public void onCreate() {
		// TODO Auto-generated method stub
		super.onCreate();
		mcContext = getApplicationContext();
	}
}
