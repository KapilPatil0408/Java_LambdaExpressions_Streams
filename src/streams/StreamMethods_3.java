package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamMethods_3 {

	
	public static void main(String[] args) {
	
		List<String> numbers= Arrays.asList("A", "B", "C", "1","2","3");
		
		//reduce()
		Optional<String> reduced= numbers.stream().reduce((value, combinedValue) -> {return combinedValue + value;});
		System.out.println(reduced.get());
	}
	

}
