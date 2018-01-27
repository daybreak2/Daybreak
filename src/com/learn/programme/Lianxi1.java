package com.learn.programme;

public class Lianxi1 {

	public static void main(String[] args) {
		int n=5;
		rec rc=new rec();
	System.out.println(n+"!="+rc.ref(n));

	}

}
class rec{
	public long ref(int n){
		long value=0;
		if(n==1){
			value=1;
		}else{
			value=n*ref(n-1);
		}
		return value;
	}
}