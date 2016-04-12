package com.wtu.wziyi.cn.adapter;

import java.util.List;

import com.wtu.wziyi.cn.R;
import com.wtu.wziyi.cn.domain.MusicMessage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MusicAdapter extends AppBaseAdapter {

	private Context mContext;
	private List<MusicMessage> mList;
	
	private int imgs[] = new int[]{
		R.drawable.bg_zjl_1,
		R.drawable.bg_zjl_2,
		R.drawable.bg_zjl_3,
		R.drawable.bg_zjl_4,
		R.drawable.bg_zjl_5,
		R.drawable.bg_zjl_6,
		R.drawable.bg_zjl_7,
		R.drawable.bg_zjl_8,
	};
	
	private int imgsBackgroud [ ] = new int []{
		R.drawable.seasons_clockweather41_bg_spring,
		R.drawable.seasons_clockweather41_bg_summer,
		R.drawable.seasons_clockweather41_bg_fall,
		R.drawable.seasons_clockweather41_bg_winter
	};
	
	public MusicAdapter(Context context ,List<MusicMessage> list){
		this.mContext = context;
		this.mList = list;
	}
	
	public int getCount() {
		// TODO Auto-generated method stub
		return this.mList.size();
	}

	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		ViewHolder holder = null;
		if(convertView == null){
			holder = new ViewHolder();
			convertView = LayoutInflater.from(mContext).inflate(R.layout.item_main_activity_music, null);
			holder.lRoot =  (LinearLayout) convertView.findViewById(R.id.item_main_lay_root);
			holder.iv = (ImageView) convertView.findViewById(R.id.item_main_music_iv);
			holder.tvName = (TextView) convertView.findViewById(R.id.item_main_muisc_tv_name);
			holder.tvCreater = (TextView) convertView.findViewById(R.id.item_main_muisc_tv_creater);
			convertView.setTag(holder);
		}else{
			holder = (ViewHolder) convertView.getTag();
		}
		holder.lRoot.setBackgroundResource(imgsBackgroud[position%4]);
		
		holder.iv.setImageResource(imgs[position%imgs.length]);
		holder.tvName.setText(mList.get(position).getName());
		holder.tvCreater.setText(mList.get(position).getCreater());
		return convertView;
	}
	
	static class ViewHolder{
		public LinearLayout lRoot;
		public ImageView iv;
		public TextView tvName;
		public TextView tvCreater;
	}

}
