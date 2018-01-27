package com.learn.programme;

public class ForTest {

	public static void main(String[] args) {
		int x,y,mul,sum=0;
		for(x=1;x<=10;x++){
			mul=1;
			for(y=1;y<=x;y++){
				mul=mul*y;
				
			}
			sum+=mul;
		}
		System.out.println(" 1！+2！+3！+„„+10！= "+sum);

}
}