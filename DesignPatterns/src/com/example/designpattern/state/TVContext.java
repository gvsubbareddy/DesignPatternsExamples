package com.example.designpattern.state;



public class TVContext {
	State tvState;

	/**
	 * @return the tvState
	 */
	public State getTvState() {
		return tvState;
	}

	/**
	 * @param tvState the tvState to set
	 */
	public void setTvState(State tvState) {
		this.tvState = tvState;
	}

	public void doAction() {
		this.tvState.doAction();

	}
	

}
