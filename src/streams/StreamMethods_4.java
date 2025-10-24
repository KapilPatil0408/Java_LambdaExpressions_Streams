package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamMethods_4 {

	
	public static void main(String[] args) {
	
		List<String> numbers= Arrays.asList("A", "B", "C", "1","2","3");
		
		 Object arr[]= numbers.stream().toArray();
		 System.out.println(arr.length);
		 for(Object O: arr) {
			 System.out.println(O);
		 }
	}
	

}
