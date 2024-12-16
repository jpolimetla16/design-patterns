package com.jp.singleton.demo;

/**
 * 
 * @author Janardhan Polimetla
 * Real time examples of Singleton -- Logger,Connection Pooling,cache,by default spring beans.
 *
 */
public enum MySingleton {

	INSTANCE;
	
	public void display() {
		System.out.println(this.hashCode());
	}

}
