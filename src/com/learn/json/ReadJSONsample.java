package com.learn.json;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class ReadJSONsample {

	public static void main(String[] args) throws IOException, JSONException {
		File file=new File(ReadJSONsample.class.getResource("/person.json").getFile());
         String content=FileUtils.readFileToString(file,"utf-8");
         JSONObject jsonbject=new JSONObject(content);
         System.out.println("姓名是："+jsonbject.getString("name"));
         System.out.println("年龄是："+jsonbject.getInt("age"));
         System.out.println("生日是："+jsonbject.getString("birthday"));
         System.out.println("大学是："+jsonbject.getString("school"));
         System.out.println("出生于："+jsonbject.getString("address"));
         JSONArray jsonarray=jsonbject.getJSONArray("major");
         for(int i=0;i<jsonarray.length();i++){
        	 String m=(String) jsonarray.get(i);
        	 System.out.println("专业-"+(i+1)+m);
         }

	}

}
