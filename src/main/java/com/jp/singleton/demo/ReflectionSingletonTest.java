package com.jp.singleton.demo;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectionSingletonTest {

	public static void main(String[] args) {
		MySingleton mySingleton1 = MySingleton.INSTANCE;
		mySingleton1.display();
		MySingleton mySingleton2 = null;
		Constructor<?>[] constructors = MySingleton.class.getDeclaredConstructors();
		for (Constructor<?> constructor : constructors) {
			constructor.setAccessible(true);
			try {
				mySingleton2 = (MySingleton)constructor.newInstance(MySingleton.class);
				mySingleton2.display();
			} catch (InstantiationException | IllegalAccessException | IllegalArgumentException
					| InvocationTargetException e) {
				e.printStackTrace();
			}
		}
		
	}

}
