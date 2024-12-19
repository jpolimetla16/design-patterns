package com.jp.builder.pattern;

public class User {

	private String firstName;
	private String lastName;
	private String age;
	private Integer salary;
	
	private User(UserBuilder builder) {
		this.firstName= builder.firstName;
		this.lastName = builder.lastName;
		this.age= builder.age;
		this.salary= builder.salary;
		
	}
	
	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", salary=" + salary + "]";
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	
	public static class UserBuilder{
		
		private String firstName;
		private String lastName;
		private String age;
		private Integer salary;
		
		public UserBuilder(String firstName,String lastName) {
			this.firstName= firstName;
			this.lastName= lastName;
		}
		
		public UserBuilder age(String age) {
			this.age=age;
			return this;
		}
		public UserBuilder salary(Integer salary) {
			this.salary=salary;
			return this;
		}
		
		public User build() {
			User user = new User(this);
			return user;
		}
		
	}
	
	
	

}
