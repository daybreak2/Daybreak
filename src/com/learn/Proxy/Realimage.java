package com.learn.Proxy;

public class Realimage implements Image {
private String fileName;
public Realimage(String fileName) {
	this.fileName=fileName;
	loadFrom(fileName);
	
}
	public void display() {
	System.out.println("Display:"+fileName);
	}

   private void loadFrom(String fileName) {
		System.out.println("load:"+fileName);
	}
}
