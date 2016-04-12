package com.wtu.wziyi.cn;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.wtu.wziyi.cn.actity.PlayActivity;
import com.wtu.wziyi.cn.adapter.MusicAdapter;
import com.wtu.wziyi.cn.domain.MusicMessage;

import android.os.Bundle;
import android.os.Handler;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

public class MainActivity extends AppBaseActivity {

	private ListView lv;
	private MusicAdapter adapter;
	private List<MusicMessage> mList;
	
	private String strName[] = new String []{
			"听妈妈的话",
			"一路向北",
			"稻香",
			"我的地盘",
			"安静",
			"蒲公英的约定",
			"退后",
			"最后的战役",
			"阳光宅男",
			"青花瓷",
			"算什么男人"
	};
	@Override
	protected void initVariables() {
		// TODO Auto-generated method stub
		getTitleTvShow().setText("YiBao");
		mList = getData();
		adapter = new MusicAdapter(MainActivity.this, mList);
	}

	private List<MusicMessage> getData() {
		// TODO Auto-generated method stub
		List<MusicMessage> list = new ArrayList<MusicMessage>();
		MusicMessage message = null;
		Random random = new Random();
		for (int i = 0; i < 30; i++) {
			message = new MusicMessage(strName[random.nextInt(strName.length)], null, null, "周杰伦", "nothing");
			list.add(message);
		}
		return list;
	}

	@Override
	protected void initComp(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		setContentView(R.layout.activity_main);
		lv = (ListView) findViewById(R.id.activity_main_lv);
		lv.setAdapter(adapter);
		lv.setOnItemClickListener(new OnItemClickListener() {

			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				// TODO Auto-generated method stub
				PlayActivity.startPlayActivity(MainActivity.this, mList.get(position));
			}
		});
	}

	@Override
	protected void loadData() {
		// TODO Auto-generated method stub
		
	}

	/**
	 * 启动MainActivity
	 * @param context
	 */
	public static void startMainActivity(Context context){
		context.startActivity(new Intent(context, MainActivity.class));
	}

}
