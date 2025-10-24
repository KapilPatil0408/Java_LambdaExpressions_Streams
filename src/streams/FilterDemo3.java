package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo3 {

	public static void main(String[] args) {
		
		List<String> names= Arrays.asList("Melisandre", "Sansa", "Jon", "Daenerys", "Joffrey");
		
		List<String> longNames= new ArrayList<String>();
		
	/*	longNames= names.stream().filter(n -> n.length()>6 && n.length()<8).collect(Collectors.toList());
		System.out.println(longNames);
	*/
	
		//names.stream().filter(n -> n.length() > 6 && n.length() < 8).forEach(n -> System.out.println(n));
		
		names.stream().filter(n -> n.length() > 6 && n.length() < 8).forEach(System.out::println);
		
		}

	}


