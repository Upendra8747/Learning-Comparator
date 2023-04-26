package customSorting;

import java.util.Comparator;

public class SortEmployeeById implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
		return e1.id-e2.id;// for decending return e2.id-e1.id;
	}

}

//e1--> object to be inserted e2--> already existing object
