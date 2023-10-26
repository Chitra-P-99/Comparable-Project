package com;

public class Student {
	int age;
	public Student(int age) {
		this.age=age;
	}
	@Override
	public String toString() {
		return "Age is "+age;
	}

}
