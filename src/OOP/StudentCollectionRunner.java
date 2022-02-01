package OOP;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class DescendingStudentComparator implements Comparator<StudentCollection>{

	@Override
	public int compare(StudentCollection student1, StudentCollection student2) {
		return Integer.compare(student1.getId(), student2.getId());
	}
	
}

public class StudentCollectionRunner {

	public static void main(String[] args) {
		List<StudentCollection> student = List.of(new StudentCollection(1, "Mon"), new StudentCollection(100, "adam"), new StudentCollection(2, "eve"));
		
		ArrayList<StudentCollection> studentAl = new ArrayList<>(student);
		
		System.out.println(student);
		System.out.println(studentAl);
		
		Collections.sort(studentAl);
		
		System.out.println(studentAl);
		
		Collections.sort(studentAl, new DescendingStudentComparator());
		System.out.println("DescendingStudentComparator " + studentAl);
	}

}
