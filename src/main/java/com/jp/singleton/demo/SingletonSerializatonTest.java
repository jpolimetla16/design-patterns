package com.jp.singleton.demo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Objects;

public class SingletonSerializatonTest {

	public static void main(String[] args) {
		
		MySingleton singleton1 = MySingleton.INSTANCE;
		MySingleton singleton2 = null;
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singleton.ser"));
			oos.writeObject(singleton1);
			
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("singleton.ser"));
			singleton2 = (MySingleton)ois.readObject();
			
		}catch(Exception exe) {
			exe.printStackTrace();
		}
		
		System.out.println(Objects.equals(singleton1.hashCode(),singleton2.hashCode()));

	}

}
