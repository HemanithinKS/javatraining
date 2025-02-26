package com.celcom.day13;

public class genericExample<T> {
	private T gen;

	public T getGen() {
		return gen;
	}

	public void setGen(T gen) {
		this.gen = gen;
	}
	
	private void add(T gen) {
		this.gen = gen;
	}
	

	
}


