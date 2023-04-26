package customSorting;

public class Student {
	int age;
	public Student(int age) {
		this.age=age;
	}
	@Override
	public String toString() {
		return "Age is "+age;
	}
}
/*---RULES FOR COMAPARATOR DE-FAULT SORTING
 * 1. Create a new calss which implements Comparator interface & import from java.util package.
 * 2.Specify the generics.
 * 3.Override the compare method 	SYNTAX--> public int comapre(Element e1 , Element e2);
 * 4.Create an object of sorting logic class & pass it to the constructor of treeset.
 * 
 */
