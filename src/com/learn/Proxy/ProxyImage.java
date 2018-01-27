package com.learn.Proxy;

public class ProxyImage implements Image {
private Realimage real;
private String fileName;
public ProxyImage(String fileName) {
	this.fileName=fileName;
}
	public void display() {
		// TODO Auto-generated method stub
		if(real==null) {
			real=new Realimage(fileName);
		}
		real.display();
		
	}

}
