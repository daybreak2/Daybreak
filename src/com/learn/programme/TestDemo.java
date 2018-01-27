package com.learn.programme;

public class TestDemo {

	public static void main(String[] args) {
		int data[]=new int[]{1,4,2,9,3,11};//原始数组
        sort(data);//排序方法
        print(data);//输出数组
	}
public static void sort(int temp[]){
	for(int x=0;x<temp.length;x++){ //控制排序次数
		for(int y=0;y<temp.length-1;y++){ //排序数组
			if(temp[y]>temp[y+1]){ //后面的数据小
			int i=temp[y]; //交换数据
			temp[y]=temp[y+1]; //交换数据
			temp[y+1]=i; //交换数据
			} 
		}
	}
}
	public static void print(int temp[]){
		for(int x=0;x<temp.length;x++){
			System.out.print(temp[x]+".");
		}
		
	}
}
