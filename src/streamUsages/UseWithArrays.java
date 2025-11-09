package streamUsages;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UseWithArrays {

	public static void main(String[] args) {
		
		// 1. Creating a Stream from an Array
		
		// option 1
		String[] names = {"John", "Jane", "Jack"};
		Arrays.stream(names)
		      .forEach(System.out::println);
		
		// option 2
		Stream.of(names)
	      .forEach(System.out::println);

		int[] numbers = {3, 1, 7, 2, 9};
		Arrays.stream(numbers)
		      .filter(n -> n > 5)
		      .forEach(System.out::println);

		// 2. Common Stream Operations with Arrays
			
		// ✅ Filter + Collect
		String[] fruits = {"apple", "banana", "kiwi", "pear"};
		List<String> longFruits = Arrays.stream(fruits)
		                                .filter(f -> f.length() > 4)
		                                .collect(Collectors.toList());

		System.out.println(longFruits); // [apple, banana]
		
		//✅ Map (Transform)

		int[] numbers1 = {1, 2, 3, 4, 5};
		int[] doubled = Arrays.stream(numbers1)
		                      .map(n -> n * 2)
		                      .toArray();

		System.out.println(Arrays.toString(doubled)); // [2, 4, 6, 8, 10]

		// ✅ Sort
		
		String[] names1 = {"Zoe", "Alex", "John"};
		Arrays.stream(names1)
		      .sorted()
		      .forEach(System.out::println);
		
		// ✅ Reduce (Sum, Min, Max, etc.)
		
		int[] numbers2 = {3, 5, 7, 2};
		int sum = Arrays.stream(numbers2)
		                .reduce(0, Integer::sum);
		System.out.println(sum);  // 17

		// ✅ Convert Array → List
		
		String[] cities = {"Paris", "London", "Tokyo"};
		List<String> cityList = Arrays.stream(cities)
		                              .collect(Collectors.toList());
		
		// ✅ Flatten 2D Arrays
		
		String[][] data = { {"A", "B"}, {"C", "D"}, {"E"} };

		List<String> flatList = Arrays.stream(data)
		                              .flatMap(Arrays::stream)
		                              .collect(Collectors.toList());

		System.out.println(flatList); // [A, B, C, D, E]


	}

}
