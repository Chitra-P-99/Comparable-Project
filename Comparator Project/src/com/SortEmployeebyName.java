package com;

import java.util.Comparator;

public class SortEmployeebyName implements Comparator<Employee>
{

	@Override
	public int compare(Employee e1, Employee e2) {
		 
		return e1.name.compareTo(e2.name);//Asc order 
		// to compare String Object we are using compareTo() of String class
		//return e2.name.compareTo(e1.name);
	}

}
