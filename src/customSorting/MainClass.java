package customSorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		Employee e1 = new Employee(101, "uppi", 5.5);
		Employee e2 = new Employee(102, "hari", 4.5);
		Employee e3 = new Employee(103, "Navi", 3.5);
		
		
		List<Employee>  l = new ArrayList<Employee>();
		l.add(e1);
		l.add(e2);
		l.add(e3);
		
		for(Employee e : l) {
			System.out.println(e);
		}
		
		System.out.println("----------");
		Collections.sort(l, new SortEmployeeById());
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1:Id\n2:Name\n3:Salary");
		System.out.println("Enter your choice");
		
		int choice =scan.nextInt();
		switch(choice) {
		case 1:
			Collections.sort(l, new SortEmployeeById());
			for(Employee e : l) {
				System.out.println(e);
			}
			break;
		case 2:
			Collections.sort(l,new SortEmployeeByName());
			for(Employee e : l) {
				System.out.println(e);
			}
			break;
		case 3:
			Collections.sort(l,new SortEmployeeSalary());
			for(Employee e : l) {
				System.out.println(e);
			}
			break;
		}
		
		
	}
}
