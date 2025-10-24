package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class labour{
	int empId;
	String empName;
	int salary;
	
	public labour(int empId, String empName, int salary) {
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
	}
}

public class MapDemo4 {
	
	public static void main(String[] args) {
	
		List<labour> labourList= Arrays.asList(
				new labour(101, "Vicky", 10000),
				new labour(102, "Nihal", 20000),
				new labour(103, "Nirnay", 30000),
				new labour(104, "Vishal", 40000),
				new labour(105, "Edward", 50000)
				);
		
		
		
		List<Integer> empSalList= labourList.stream()
					.filter(emp -> emp.salary > 20000)
					.map(emp -> emp.salary)
					.collect(Collectors.toList());
		
		System.out.println(empSalList);	
	
		
	}

}
