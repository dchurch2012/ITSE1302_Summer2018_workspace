import java.util.*;

public class StudentDemo {
	static final int NUM_STUDENTS = 4;
	public static void main(String[] args) {
		
		Student students[] = new Student[NUM_STUDENTS];
		
		for(int index = 0; index < students.length; index++) {
			students[index] = new Student();
					
		}
		
		students[0].FirstName = "Sara";
		students[0].LastName = "Smith";
		students[0].studentID = 1232;

		students[1].FirstName = "Eugene";
		students[1].LastName = "Hernandez";
		students[1].studentID = 12333232;
		
		for(int index = 0; index < students.length; index++) {
			System.out.println("First Name : " + students[index].FirstName);
			System.out.println("Last Name : " + students[index].LastName);
			System.out.println("ID : " + students[index].studentID);
			System.out.println();	
			
		}
		
		ArrayList<Student> students2 = new ArrayList<Student>();
		

	}
}
