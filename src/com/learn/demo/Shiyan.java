package com.learn.demo;

/*
 * @Author Daybreak 
 *  2018年1月23日
 * 
 */
public class Shiyan {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final int a=3;
		System.out.println(a);
		Shiyan.change(a);
	}
	public static void change(int a) {
		a=a*6;
		System.out.println(a);
	}
}
