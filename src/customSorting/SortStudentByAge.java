package customSorting;

import java.util.Comparator;

public class SortStudentByAge implements Comparator<Student> {
	@Override
public int compare(Student s1 , Student s2) {
	return s1.age-s2.age;
	// In decending order --> return s2.age- s1.age
}
}
// s1 ---> object to be inserted.
// s2----> already existing object.

