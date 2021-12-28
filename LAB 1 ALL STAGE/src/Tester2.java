import java.util.*;

public class Tester2 {

	public static void main(String args[]){


		StudentList sl = new StudentList();

		Student m1 = new Student("Chan", "Meiying", "A12345", "0131234567", 80.0, 80.1, 99.0);
		Student m2 = new Student("Suraya", "Ahmad", "A12346", "0131235678", 60.0, 75.0, 99.0);
		Student m3 = new Student("Suraya", "Ahmad", "A12346", "0131235678", 60.0, 75.0, 99.0);


		addNewStudent(sl, m1);
		addNewStudent(sl, m2);
		addNewStudent(sl, m3);


		ArrayList <Student> std = sl.getStudentList();

		if(std == null)
			System.out.println("Error: ArrayList object was not created");
		else
			System.out.println("Total students: "+std.size());

	}

	public static void addNewStudent(StudentList t, Student m){

		if(t.addStudent(m))
			System.out.println("Addition of a new student: "+m.getFirstName()+" "+m.getLastName()+" is successfull");
		else
			System.out.println("Addition of a new student: "+m.getFirstName()+" "+m.getLastName()+" has failed, because this student is already exist in the list");

	}


}