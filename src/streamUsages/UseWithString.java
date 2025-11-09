package streamUsages;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UseWithString {

	public static void main(String[] args) {
		
		// 1. Convert String → Stream 
			//A. Using chars()
		String input = "hello";
		input.chars()          // returns IntStream (each char as int)
		      .forEach(System.out::println);
		
		
		input.chars()
	     .mapToObj(c -> (char) c)   // convert int → char
	     .forEach(System.out::println);
		
		
			// B. Using split()
		
		String input1 = "apple banana cherry";
		Arrays.stream(input1.split(" "))
		      .forEach(System.out::println);
		
		
			// C. Using Stream.of()
		
		Stream.of("Java", "Python", "C++")
	      .map(String::toUpperCase)
	      .forEach(System.out::println);
		
		
	 // 2. Common Stream Operations on Strings
		
		// A. Count vowels
		
		String input2 = "programming";
		long count = input2.chars()
		                  .mapToObj(c -> (char) c)
		                  .filter(ch -> "aeiouAEIOU".indexOf(ch) != -1)
		                  .count();
		System.out.println("Vowel count: " + count);

		
		// B. Remove vowels and capitalize first letter
		
		String input3 = "automation";
		String result = input3.chars()
		                     .mapToObj(c -> (char) c)
		                     .filter(ch -> "aeiouAEIOU".indexOf(ch) == -1)
		                     .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
		                     .toString();

		result = Character.toUpperCase(result.charAt(0)) + result.substring(1);
		System.out.println(result);  // Output: "Tmtntn"
		

		//C. Reverse a string using Streams
		
		
		String input4 = "stream";
		String reversed = input4.chars()
		                       .mapToObj(c -> (char) c)
		                       .collect(Collectors.collectingAndThen(
		                             Collectors.toList(),
		                             list -> { Collections.reverse(list);
		                                       return list.stream()
		                                                  .map(String::valueOf)
		                                                  .collect(Collectors.joining());
		                             }));
		System.out.println(reversed); // maerts


	}

}
