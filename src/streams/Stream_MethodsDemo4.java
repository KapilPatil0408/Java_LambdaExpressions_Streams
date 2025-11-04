package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream_MethodsDemo4 {

	public static void main(String[] args) {
		
		List<String> animalsList= Arrays.asList("Dog","Cat", "Elephnat");
		List<String> birdsList= Arrays.asList("peackock","parrot", "crow");
		
		Stream<String> stream1= animalsList.stream();
		Stream<String> stream2= birdsList.stream();
		
		List<String> cStream= Stream.concat(stream1, stream2).collect(Collectors.toList());
		
		for(String item: cStream) {
		///	System.out.println(item= );
		}
	}

}
