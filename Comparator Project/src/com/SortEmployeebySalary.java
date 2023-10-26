package com;

import java.util.Comparator;

public class SortEmployeebySalary implements Comparator<Employee>
{

	@Override
	public int compare(Employee e1, Employee e2) {
		
		return e1.salary.compareTo(e2.salary);//Asc Order
		//return e2.salary.compareTo(e1.salary);
		
		
		
		//to compare Double Objects ,use compareTo() of Double class
	}

}
