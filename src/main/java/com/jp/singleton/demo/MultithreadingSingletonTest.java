package com.jp.singleton.demo;

public class MultithreadingSingletonTest {

	public static void main(String[] args) {
		Runnable runnable = ()->{
			MySingleton singleton = MySingleton.INSTANCE;
			singleton.display();
		};
		
		Thread thread1 = new Thread(runnable);
		Thread thread2 = new Thread(runnable);
		Thread thread3 = new Thread(runnable);
		
		thread1.start();
		thread2.start();
		thread3.start();
		
	}

}
