package com.jp.singleton.demo;

public class CloneableSingletonTest {

	public static void main(String[] args) {
		MySingleton singleton1 = MySingleton.INSTANCE;
		
		//cannot access clone method since clone is protected in objects class
		//singleton1.clone();
	}

}
