package com.learn.observer;

/**
 * @Author Daybreak 
 *  2018年1月27日
 * 
 */
public class BinaryObserver extends Observer{
public BinaryObserver(Subject subject) {
	this.subject=subject;
	this.subject.attach(this);
}
	/* (non-Javadoc)
	 * @see com.learn.observer.Observer#update()
	 */
	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("Binary String:"+Integer.toBinaryString(subject.getState()));
	}

}
