package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap_Demo2 {

	public static void main(String[] args) {

		List<String> teamA= Arrays.asList("Scott", "David", "John");
		List<String> teamB= Arrays.asList("Mary", "Luna", "Tom");
		List<String> teamC= Arrays.asList("Ken", "Jony", "Kitty");
		
		List<List<String>> personInWorldCup= new ArrayList<List<String>>();
		personInWorldCup.add(teamA);
		personInWorldCup.add(teamB);
		personInWorldCup.add(teamC);
		
		//Before Java 8	

/*		for(List<String> team:personInWorldCup) {
			for(String name:team) {
				System.out.println(name);
			}
		}
	*/
		
	
		// using stream flatMap()
		List<String> names= personInWorldCup.stream().flatMap(pList -> pList.stream()).collect(Collectors.toList());
		System.out.println(names);
		
	}

}
