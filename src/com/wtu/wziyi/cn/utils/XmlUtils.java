package com.wtu.wziyi.cn.utils;

import java.io.IOException;

import org.xmlpull.v1.XmlPullParserException;

import com.wtu.wziyi.cn.R;
import com.wtu.wziyi.cn.app.AppCotext;

import android.R.string;
import android.content.Context;
import android.content.res.XmlResourceParser;
import android.util.Log;

public class XmlUtils {

	private static Context mContext ;
	
	static{
		mContext = AppCotext.getContext();
	}
	
	/**
	 * 依据配置文件的设置来获取响应信息
	 * @param xmlRes xml文件资源
	 * @param name   配置name
	 * @param def    默认值
	 * @return
	 */
	public static int getValueByName(int xmlRes,String name,int def){
		int value = def;
		XmlResourceParser xrp = mContext.getResources().getXml(xmlRes);
		try {
			while(xrp.getEventType()!=XmlResourceParser.END_DOCUMENT){
				//如果遇到开始标签
				if(xrp.getEventType() == XmlResourceParser.START_TAG){
					//获取该标签的标签名
					String tagName = xrp.getName();
					//如果遇到config标签
					if(tagName.endsWith("config")){
						//根据属性名来获取属性值
						String attrName = xrp.getAttributeValue(0);
						if(name.equals(attrName)){
							String strValue = xrp.nextText();
							value = Integer.parseInt(strValue);
						}
					}
				}
			}
		}  catch (XmlPullParserException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			LogUtils.e("error", e.toString());
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			LogUtils.e("error", e.toString());
		}
		return value;
	}
}
