package com.learn.observer;

/**
 * @Author Daybreak 
 *  2018年1月27日
 * 
 */
public class HexaObserver extends Observer {
public HexaObserver(Subject subject) {
	this.subject=subject;
	this.subject.attach(this);
}
	/* (non-Javadoc)
	 * @see com.learn.observer.Observer#update()
	 */
	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("Hex String:"+Integer.toHexString( subject.getState() ).toUpperCase());
	}

}
