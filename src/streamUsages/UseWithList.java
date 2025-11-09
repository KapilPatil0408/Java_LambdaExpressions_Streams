package streamUsages;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class UseWithList {

	public static void main(String[] args) {
		
		// 1. Using Streams with a List
		
		List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve");

		// A. Filter elements
		
		names.stream()
	     .filter(n -> n.startsWith("A"))
	     .forEach(System.out::println);

		// B. Transform (map) elements
		
		List<String> upper = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
		System.out.println(upper);

		// C. Sort elements
		
		names.stream()
	     .sorted()
	     .forEach(System.out::println);

		names.stream()
	     .sorted(Comparator.reverseOrder())
	     .forEach(System.out::println);

		// D. Count elements
		
		long count = names.stream()
                .filter(n -> n.length() > 3)
                .count();
		System.out.println("Names longer than 3 letters: " + count);

		// E. Reduce (sum, concat, etc.)
		
		List<Integer> numbers = Arrays.asList(3, 4, 5, 6);
		int sum = numbers.stream()
		                 .reduce(0, Integer::sum);

		System.out.println("Sum = " + sum);

		
		// F. Collect results (to List/Set/String)
		
		List<String> filtered = names.stream()
                .filter(n -> n.contains("a"))
                .collect(Collectors.toList());
		// To Set
		Set<String> nameSet = names.stream()
                .collect(Collectors.toSet());
		
		// To Single String
		String joined = names.stream()
                .collect(Collectors.joining(", "));
		System.out.println(joined);  // Alice, Bob, Charlie, David, Eve

		
		
		
		

	}

}
