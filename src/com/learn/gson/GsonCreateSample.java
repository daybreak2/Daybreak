package com.learn.gson;

import java.lang.reflect.Field;

import com.google.gson.FieldNamingStrategy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class GsonCreateSample {

	public static void main(String[] args) {
		Person person=new Person();
		person.setName("邓肯");
		person.setAddress("美国加州");
		person.setAge(45);
		person.setSchool("加州大学");
		person.setMajor(new String[]{"法学","经济学","证劵"});
		GsonBuilder builder=new GsonBuilder();
		 builder.setPrettyPrinting();
		 builder.setFieldNamingStrategy(new FieldNamingStrategy() {
			
		
			 public String translateName(Field f){
				 if(f.getName().equals("name")){
					 return "NAME";
					 
				 }
				 return f.getName();
			 }

			
			 
		 });
		 Gson gson=builder.create();
		 System.out.println(gson.toJson(person));
		 
	}

}
