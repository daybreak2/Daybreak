package com.learn.programme;

public class TestDemo2 {

	public static void main(String[] args) {
		String[] str=new String[]{"hai","nan","guo","ji","lv"};
		String[] newstr=new String[10];
		System.arraycopy(str, 0, newstr, 0, str.length);
		str=newstr;
		str[6]="you";
		str[7]="dao";
		for(int x=0;x<newstr.length;x++){
			System.out.print(str[x]+" ");
		}
	}

}
