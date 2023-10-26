package com;
import java.util.Comparator;
public class SortStudentbyAge implements Comparator<Student>
{
	@Override
	public int compare(Student s1,Student s2)
	{
		return s1.age-s2.age;//Ascending order
		//return s2.age-s1.age; Desc order
	}

}





//Rules: ->Comparator is an Interface in java.util;.JDK1.2:
/*
 * 
 * 1.create a new class which implements Comparator and import from java.util pkg;
 * 2.Specify Generics;
 * 3.Override compare()
 * Syntax :public int compare(Element e1,Element e2)
 * 4.create a object of Sorting logic and pass it to constructor of TreeSet
 */