package com.learn.programme;

public class Lianxi3 {

	public static void main(String[] args) {
		System.out.println(ref(9));

	}
	public static int ref(int n){
		if(n<=2){
			return 1;
		}else{
			return ref(n-1)+ref(n-2);
		}
	}

}
