package streamUsages;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class UseWithSet {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		Set<Integer> numbers = new HashSet<>(Arrays.asList(10, 20, 30, 40, 50));

		numbers.stream()
	       .filter(n -> n > 25)
	       .map(n -> n / 10)
	       .forEach(System.out::println);

		// ➤ Convert Set → List (using Streams)
		List<Integer> numberList = numbers.stream()
                .collect(Collectors.toList());
		
		// ➤ Find min/max
		int max = numbers.stream()
                .max(Integer::compare)
                .orElseThrow();
		System.out.println("Max = " + max);
		
		
		// Distinct elements (works on List too)
		List<Integer> list = Arrays.asList(1, 2, 2, 3, 3, 3);
		List<Integer> distinct = list.stream()
		                             .distinct()
		                             .collect(Collectors.toList());
		System.out.println(distinct);  // [1, 2, 3]

		
		// Combined Example
		
		List<String> items = Arrays.asList("pen", "book", "pencil", "paper", "pen");

		Set<String> uniqueUppercase = items.stream()
		        .map(String::toUpperCase)
		        .filter(s -> s.startsWith("P"))
		        .collect(Collectors.toSet());

		System.out.println(uniqueUppercase); // [PAPER, PEN, PENCIL]



	}

}
