package com.learn.demo;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="12";
		Integer b= Integer.valueOf(a);
		Integer m=Integer.parseInt(a);
		System.out.println((b+8));
		System.out.println((m+8));
		
		int c=12;
		String d=Integer.toString(c);
		String e=String.valueOf(c);
		String f=c+"";
		System.out.println((d+8));
		System.out.println((e+8));
		System.out.println((f+8));
	}

}
