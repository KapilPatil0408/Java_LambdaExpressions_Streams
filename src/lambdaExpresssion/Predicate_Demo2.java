package lambdaExpresssion;

import java.util.ArrayList;
import java.util.function.Predicate;

class Employee{
	String ename;
	int salary;
	int experience;
	
	Employee(String ename, int salary, int experience){
		this.ename= ename;
		this.experience= experience;
		this.salary= salary;
	}
}

public class Predicate_Demo2 {

	public static void main(String[] args) {
		//emp obj ----> return name if sal > 30k exp> 3
		//Ex-1
		Employee emp= new Employee("kapil", 70000, 6); 
		Predicate<Employee> pr= e -> (e.salary>30000 && e.experience>3);
		System.out.println(pr.test(emp));
		
		//Ex-2
		ArrayList<Employee> al= new ArrayList<Employee>();
		al.add(new Employee("Kapil", 90000, 4));
		al.add(new Employee("Nikhil", 70000, 6));
		al.add(new Employee("Ravi", 20000, 4));
		al.add(new Employee("Kumar", 70000, 2));
		
		for(Employee e: al) {
			if(pr.test(e)) {
				System.out.println(e.ename+ " : "+ e.salary);
			}
		}
		
	}
}
