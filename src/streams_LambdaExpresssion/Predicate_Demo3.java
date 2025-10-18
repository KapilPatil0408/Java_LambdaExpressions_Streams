package streams_LambdaExpresssion;

import java.util.function.Predicate;

public class Predicate_Demo3 {

	// joining predicates - and, or, negate
	// p1 ----> checks number is even
	// p2 ----> checks greater than 50

	public static void main(String[] args) {

		int a[] = { 5, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60, 65 };

		Predicate<Integer> p1 = i -> i % 2 == 0;
		Predicate<Integer> p2 = i -> i > 50;

		// and operator
	/*	System.out.println("following are the numbers EVEN and greater than 50....");
		for (int n : a) {
			//if(p1.test(n) && p2.test(n)) {
			
			if(p1.and(p2).test(n)) {
				System.out.println(n);
			}
		}
	*/	
		// or operator
		
/*		for (int n : a) {
			if(p1.or(p2).test(n)) {
				System.out.println(n);
			}
		}
*/
		
		// negate operator
		
				for (int n : a) {
					if(p1.negate().test(n)) {
						System.out.println(n);
					}
				}

	}
}
