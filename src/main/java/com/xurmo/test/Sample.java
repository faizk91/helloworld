package com.xurmo.test;


public final class Sample {

	private int i;
	private String string;

	
	
	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public String getString() {
		return string;
	}

	public void setString(String string) {
		this.string = string;
	}

	public Sample(int i, String string) {
		this.i = i;
		this.string = string;
	}

	public int fun(int j) {
		return i+j;
		
	}

}
