package com.learn.programme;

public class Test2 {

	public static void main(String[] args) {
		Animal a1=new Dog();
		a1.eat();//静态方法不具有多态效果，它是根据引用声明类型来调用
		a1.pao();
		Dog a2=new Dog();
		a2.eat();
		a2.pao();

	}

}
