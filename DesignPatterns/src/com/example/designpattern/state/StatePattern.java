package com.example.designpattern.state;

public class StatePattern {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		State startState = new TVOnState();
		State stopState = new TVOffState();
		TVContext cntxt = new TVContext();
		cntxt.setTvState(startState);
		cntxt.doAction();
		cntxt.setTvState(stopState);
		cntxt.doAction();

	}

}
