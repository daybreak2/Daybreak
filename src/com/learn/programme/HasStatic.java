package com.learn.programme;

public class HasStatic {
private static int x=100;
	public static void main(String[] args) {
		//int x=100;
		//final int x=101;
		HasStatic hs1=new HasStatic();
		hs1.x++;
		HasStatic hs2=new HasStatic();
		hs2.x++;
		hs1=new HasStatic();
		hs1.x++;
		HasStatic.x--;
		System.out.println("x="+x);
		

	}
//	public static void sum(int x){
//		HasStatic hs3=new HasStatic();
//		hs3.x++;
//		HasStatic hs4=new HasStatic();
//		hs4.x++;
//		System.out.println("x="+x);
//	}
	

}
