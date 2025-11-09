package streamUsages;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class UseWithMap {

	public static void main(String[] args) {
		
		// 
		
		Map<String, Integer> scores = new HashMap<>();
		scores.put("Alice", 90);
		scores.put("Bob", 75);
		scores.put("Charlie", 85);
		scores.put("David", 92);

		// Stream over Keys
		
		scores.keySet().stream()
	      .filter(name -> name.startsWith("A"))
	      .forEach(System.out::println);

		// Stream over Values
		
		int total = scores.values().stream()
                .mapToInt(Integer::intValue)
                .sum();
		System.out.println("Total score = " + total);
		
		
		// Stream over Entries (Key + Value)
		
		scores.entrySet().stream()
	      .filter(entry -> entry.getValue() > 80)
	      .forEach(entry ->
	          System.out.println(entry.getKey() + " = " + entry.getValue()));

		
		// Collect Stream Back to a Map
		
		Map<String, Integer> highScores = scores.entrySet().stream()
		        .filter(e -> e.getValue() > 80)
		        .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		System.out.println(highScores);

		
		// Sorting a Map using Streams
		
		scores.entrySet().stream()
	      .sorted(Map.Entry.comparingByKey())
	      .forEach(System.out::println);

		scores.entrySet().stream()
	      .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
	      .forEach(System.out::println);

		
		// Transform (Map) the Values
		
		Map<String, Integer> bonusScores = scores.entrySet().stream()
		        .collect(Collectors.toMap(
		            Map.Entry::getKey,
		            e -> e.getValue() + 5
		        ));
		System.out.println(bonusScores);

		
		// Grouping Example (like DB “GROUP BY”)
		// Find average salary per department:
		
		Map<String, List<Integer>> salaries = new HashMap<>();
		salaries.put("QA", Arrays.asList(40000, 42000, 39000));
		salaries.put("DEV", Arrays.asList(60000, 65000, 70000));
		salaries.put("HR", Arrays.asList(35000, 36000));
		
		Map<String, Double> avgSalary = salaries.entrySet().stream()
			    .collect(Collectors.toMap(
			        Map.Entry::getKey,
			        e -> e.getValue().stream().mapToInt(Integer::intValue).average().orElse(0)
			    ));

			System.out.println(avgSalary);




	}

}
