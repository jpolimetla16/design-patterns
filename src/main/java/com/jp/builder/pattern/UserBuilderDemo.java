package com.jp.builder.pattern;

public class UserBuilderDemo {

	public static void main(String[] args) {
		 User user = new User.UserBuilder("Janardhan","Polimetla")
		 				.age("30")
		 				.salary(2000)
		 				.build();
		 System.out.println(user);
		 				
	}

}
