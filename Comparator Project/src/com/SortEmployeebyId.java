package com;
import java.util.Comparator;
public class SortEmployeebyId implements Comparator<Employee>

{
	@Override
	public int compare(Employee e1,Employee e2)
	{
		return e1.id-e2.id; //Asc order
		//return e2.id-e1.id;// Desc order
	}

}
