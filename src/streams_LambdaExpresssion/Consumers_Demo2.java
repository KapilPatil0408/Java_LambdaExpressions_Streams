package streams_LambdaExpresssion;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class worker {
	String wName;
	int salary;
	String gender;

	public worker(String wName, int salary, String gender) {
		this.wName = wName;
		this.salary = salary;
		this.gender = gender;
	}
}

public class Consumers_Demo2 {

	public static void main(String[] args) {
		ArrayList<worker> al = new ArrayList<worker>();
		al.add(new worker("sumit", 40000, "male"));
		al.add(new worker("ramesh", 70000, "male"));
		al.add(new worker("rajesh", 20000, "male"));
		al.add(new worker("suresh", 10000, "male"));
		al.add(new worker("vishal", 30000, "male"));

		Function<worker, Integer> f = emp -> { // calculate bonus
			int sal = emp.salary;

			if (sal < 20000 && sal >= 10000)
				return sal * 10 / 100;
			else if (sal < 30000 && sal >= 20000)
				return sal * 20 / 100;
			else if (sal < 40000 && sal >= 30000)
				return sal * 30 / 100;
			else
				return sal * 40 / 100;
		};

		Predicate<Integer> p = b -> b >= 5000; // check bonus is 5000 or not
		Consumer<worker> c = emp -> {
			System.out.println(emp.wName);
			System.out.println(emp.salary);
			System.out.println(emp.gender);
		};

		for (worker w : al) {
			int bonus = f.apply(w); // invoke function to calculate bonus
			if (p.test(bonus)) { // invoke predicate for bouns > 5000;
				c.accept(w); // invoke consumer to print employee deatils
				System.out.println("Employee bonus: " + bonus);
			}

		}

	}

}
