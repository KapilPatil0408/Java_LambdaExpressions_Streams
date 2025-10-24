package lambdaExpresssion;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;


class Employee1{
	String ename;
	int salary;
	
	Employee1(String ename, int salary){
		this.ename= ename;
		this.salary= salary;
	}
}

public class Functions_Demo2 {

	public static void main(String[] args) {
		
		ArrayList<Employee1> empList= new ArrayList<Employee1>();
		empList.add(new Employee1("Kapil", 70000));
		empList.add(new Employee1("Nikhil", 30000));
		empList.add(new Employee1("Vakil", 20000));
		
		Function<Employee1, Integer> fn= e ->{
									int sal= e.salary;
									
									if(sal>= 10000 && sal<=20000) {
										return (sal * 10/100);
									}else if(sal>20000 && sal<=30000) {
										return (sal * 20/100);
									}else if(sal>30000 && sal<=50000) {
										return (sal * 30/100);
									}else {
										return (sal * 40/100);
									}
								};
		
								
						Predicate<Integer> p= b -> b > 5000;
								
						for(Employee1 emp: empList) {
							
							int bonus= fn.apply(emp);
							
							if(p.test(bonus)) {
							System.out.println(emp.ename+" = "+emp.salary);
							System.out.println("Bonus is: "+ bonus);
							}
						}
		
									

	}

}
