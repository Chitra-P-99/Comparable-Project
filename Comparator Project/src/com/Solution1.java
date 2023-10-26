package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
//import java.util.TreeSet;

public class Solution1 {

	public static void main(String[] args) {
		Employee e1=new Employee(104,"Ajin",60.5);
		Employee e2=new Employee(102,"Bob",50.5);
		Employee e3=new Employee(103,"Jerin",11.7);
		List<Employee> l=new ArrayList<>();
		l.add(e1);
		l.add(e2);
		l.add(e3);
		for(Employee i:l) {
			System.out.println(i);
			
		}
		System.out.println("*==*==*==*==*==*==*==*==*==*==*==*==*==*");
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter the choice \n1.Sort by Id\n2.Sort by Name\n3.Sort by Salary");
		int n=ip.nextInt();
		switch(n)
		{
		case 1: Collections.sort(l,new SortEmployeebyId());
		for(Employee e:l)
		{
			System.out.println(e);
		}
		
		break;
		case 2:Collections.sort(l,new SortEmployeebyName());
		for(Employee e:l)
		{
			System.out.println(e);
		}
		break;
		case 3:Collections.sort(l,new SortEmployeebySalary());
		for(Employee e:l)
		{
			System.out.println(e);
		}
		break;
		default: System.out.println("Please enter 1 - 3");
		}

	}

}
