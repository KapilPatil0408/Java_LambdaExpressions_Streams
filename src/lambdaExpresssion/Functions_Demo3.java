package lambdaExpresssion;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

public class Functions_Demo3 {

	public static void main(String[] args) {

		Function<Integer, Integer> fn = n -> n * 2;
		Function<Integer, Integer> fn2 = n -> n * n * n;
		
		System.out.println(fn.andThen(fn2).apply(2));
		System.out.println(fn.compose(fn2).apply(2)); // reverse order f2 will be executed 1st then f1

	}

}
