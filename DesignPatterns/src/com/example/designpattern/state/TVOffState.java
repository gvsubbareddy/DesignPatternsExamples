/**
 * 
 */
package com.example.designpattern.state;

/**
 * @author vijay
 * 
 */
public class TVOffState implements State {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.example.designpattern.State#doAction()
	 */
	public void doAction() {
		System.out.println("TV is turned OFF!!");

	}

}
