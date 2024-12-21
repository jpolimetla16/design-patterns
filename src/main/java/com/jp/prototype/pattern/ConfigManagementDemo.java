package com.jp.prototype.pattern;

public class ConfigManagementDemo {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		ConfigManagement config = new ConfigManagement();
		config.setProperty("database.url","test");
		System.out.println(config.getProperty("database.url"));
		
		System.out.println(config.clone());
		System.out.println(config.clone());

		
		
		
	}

}
