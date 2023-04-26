package customSorting;

import java.util.Comparator;

public class SortEmployeeByName implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {
		return e1.name.compareTo(e2.name); //desending order --> return y.name.compareTo(x.name);
	}

}
//we are using compareTo method to compare the String element.
