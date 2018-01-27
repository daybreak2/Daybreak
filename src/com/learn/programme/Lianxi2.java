package com.learn.programme;

public class Lianxi2 {

	public static void main(String[] args) {
		System.out.println(ref(5));

	}



	public static long ref(int n){
		
		if(n==1)
			return 1;
		else
			
			return n*ref(n-1);
		
	}	
	
}