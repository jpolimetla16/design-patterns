package com.jp.singleton.demo;

public enum MySingleton {

	INSTANCE;
	
	public void display() {
		System.out.println(this.hashCode());
	}

}
