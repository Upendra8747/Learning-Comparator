package customSorting;

import java.util.TreeSet;

public class Solution {
	public static void main(String[] args) {
	Student s1 = new Student(23);
	Student s2 = new Student(22);
	Student s3 = new Student(21);
	
	SortStudentByAge sortStudentByAge = new SortStudentByAge();
	TreeSet<Student> t = new TreeSet<Student>(sortStudentByAge);
	t.add(s1);
	t.add(s2);
	t.add(s3);
	for(Student s : t) {
		System.out.println(s);
	}
	}
}
// passing the  object reference of SortStudentByAge Object to say the method call not to call compareTo method rather than comapre method.
