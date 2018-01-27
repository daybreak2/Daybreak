package com.learn.Singleton;
//懒汉式
public class Singleton1 {
private static Singleton1 singleton=null;
private Singleton1(){
}
public static Singleton1 getIntence() {
	if(singleton==null) {
		singleton=new Singleton1();
	}
	return singleton;
}
public void showmassge() {
	System.out.println("单例模式被调用了");
}
}
