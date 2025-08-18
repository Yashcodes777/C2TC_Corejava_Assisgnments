package com.yaswanth.assignment.utilities;

import com.yaswanth.assignment.employees.*;

public class EmployeeUtilities {
	
	public static void printEmployeeInfo(Employee emp)
	{
		System.out.println("--------Employee Information------");
		emp.DisplayEmployeeInfo();
		System.out.println("----------------------------------");
		
	}
	
	public static void provideBonus(Employee emp, double percent)
	{
		System.out.println("Employee Salary before bonus:"); 
		double new_sal = emp.getSalary() + (emp.getSalary() * percent/100);
		emp.setSalary(new_sal);
		System.out.println("Updated salary after"+percent+"% hike: "+ new_sal);
	
	}
}