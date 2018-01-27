package com.learn.demo;
public class Demo1 {
	Demo1(int i){
		System.out.println("第一个构造器被调用了");
	}
	Demo1(double i){
		System.out.println("第二个构造器被调用了");
	}
public static void main(String[] args) {
    Demo1 m=new Demo1(1);
    Demo1 m1=new Demo1(1.22);
   //调用无参函数
   m1.print();
  //调用有参函数
    m.print("唐坚");
    m.print(23, "男");
	}
	public void print() {
		System.out.println("你调用了无参函数");
	}

	public void print(String name) {
		System.out.println("我的姓名是："+name);
	}
	private void print(int age,String sex) {
		System.out.println("我的年龄是："+age);
		System.out.println("我的性别是:"+sex);
	}

}
