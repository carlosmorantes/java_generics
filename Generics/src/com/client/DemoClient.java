package com.client;

import com.server.Box;

public class DemoClient {

	public static void main(String[] args) {
		Box<String> str = new Box<>("This is a string");
		String out = str.getValue();
		System.out.println("--- "+out);
		
		Box<Integer> in = new Box<Integer>(23);
		int out1 = in.getValue();
		System.out.println("--- "+out1);
		

	}

}
