package com.learn.observer;

/**
 * @Author Daybreak 
 *  2018年1月27日
 * 
 */
public class ObserverPatternDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  Subject subject=new Subject();
		  new HexaObserver(subject);
	      new OctalObserver(subject);
	      new BinaryObserver(subject);
	      
	      System.out.println("First state change: 15");    
	      subject.setState(15);
	      System.out.println("Second state change: 10");    
	      subject.setState(10);
		
	}

}
