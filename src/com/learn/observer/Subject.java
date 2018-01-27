package com.learn.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Daybreak 
 *  2018年1月27日
 * 
 */
public class Subject {
private List<Observer> observers=new ArrayList<Observer>();
private int state;

public int getState() {
	return state;
}
public void setState(int state) {
	this.state = state;
	notifyAllObservers();
}
//绑定观察者到 Client 对象
public void attach(Observer observer) {
	//observsers.add(observers);
	observers.add(observer);
}

//从 Client 对象解绑观察者
public void notifyAllObservers(){
    for (Observer observer : observers) {
        observer.update();
     }
  }     

}
