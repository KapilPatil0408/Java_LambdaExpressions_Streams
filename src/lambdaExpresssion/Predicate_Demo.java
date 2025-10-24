package lambdaExpresssion;

import java.util.function.Predicate;

public class Predicate_Demo {

	public static void main(String[] args) {
		
	//	Ex 1
		Predicate<Integer> p= i -> (i > 10);
		System.out.println(p.test(34));
		
	// Ex 2
		Predicate<String> pr= s -> (s.length() > 4);
		System.out.println(pr.test("Kapil"));
		System.out.println(pr.test("xyz"));
	
	
	String names[]= {"Devid", "scott", "smith", "john", "mary"};
	
	for(String name: names) {
		if(pr.test(name)) {
			System.out.println(name);
		}
	}
	}
}
