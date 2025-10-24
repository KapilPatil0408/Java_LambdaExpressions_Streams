package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo3 {
	
	public static void main(String[] args) {
		List<Integer> numbers= Arrays.asList(2,3,4,5);
		List<Integer> targetValue= new ArrayList<Integer>();
		
		// With out stream
/*		for(int num: numbers) {
			targetValue.add(num*3);
		}
		System.out.println(targetValue);
		*/
		
		// with streams
	/*	targetValue= numbers.stream().map(num -> num *3).collect(Collectors.toList());
		System.out.println(targetValue);
	*/	
		//or
		numbers.stream().map(num -> num * 3).forEach(num -> System.out.println(num));
	
		
	}

}
