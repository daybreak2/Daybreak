package com.learn.Factory;

public class FactoryPatternDemo {

	public static void main(String[] args) {
		FactoryShape shapeFactory=new FactoryShape();
		//获取circle对象，并调用它的draw方法
        Shape shape1=shapeFactory.getShape("circle");
       shape1.draw();
       
     //获取square对象，并调用它的draw方法
       Shape shape2=shapeFactory.getShape("square");
       shape2.draw();
       
       //获取ractangle对象，并调用它的draw方法
       Shape shape3=shapeFactory.getShape("rectangle");
       shape3.draw();
	}

}
