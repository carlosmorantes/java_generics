package com.server;

public class Box<T> {
	private T value;

	public Box(){}
	
	public Box(T value) {
		super();
		this.value = value;
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

}
