package customSorting;

import java.util.Comparator;

public class SortEmployeeSalary  implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
		return e1.salary.compareTo(e2.salary);
	}

}
// To compare Double Object, Using compareTo() of Double class 
