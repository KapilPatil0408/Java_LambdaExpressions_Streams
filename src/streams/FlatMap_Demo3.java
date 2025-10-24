package streams;

import java.util.ArrayList;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;



class Student{
	String sName;
	int sid;
	char grade;
	
	public Student(String sName, int sid, char grade) {
		this.sName = sName;
		this.sid = sid;
		this.grade = grade;
	}
}

public class FlatMap_Demo3 {

	public static void main(String[] args) {

		List<Student> studentList1= new ArrayList<Student>();
		studentList1.add(new Student("Smith", 409, 'A'));
		studentList1.add(new Student("Sham", 410, 'B'));
		studentList1.add(new Student("Vipul", 411, 'C'));
		
		List<Student> studentList2= new ArrayList<Student>();
		studentList2.add(new Student("Danish", 406, 'A'));
		studentList2.add(new Student("Rohan", 407, 'B'));
		studentList2.add(new Student("Divyaman", 408, 'C'));
		
		
		List<List<Student>> studentList= Arrays.asList(studentList1,studentList2);
		
		//Before Java 8 
/*		for(List<Student> sList: studentList) {
			
			for(Student studnet: sList) {
				System.out.println(studnet.sName);
			}
		}
	*/
		
		// Using stream
		List<String> student= studentList.stream()
				.flatMap(stu -> stu.stream()
				.map(s -> s.sName))
				.collect(Collectors.toList());
		System.out.println(student);
		
		
	}

}
