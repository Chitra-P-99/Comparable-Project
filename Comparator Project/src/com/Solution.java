package com;

import java.util.TreeSet;

public class Solution {
	public static void main(String[] args) {

		Student s1=new Student(30);
		Student s2=new Student(10);
		Student s3=new Student(25);
		//SortStudentbyAge a=new SortStudentbyAge (); 
		TreeSet<Student> t=new TreeSet<>(new SortStudentbyAge ());
		//TreeSet<Student> t=new TreeSet<>(a);
		t.add(s1);
		t.add(s2);
		t.add(s3);
		for(Student s:t)
		{
			System.out.println(s);
		}

	}
}
