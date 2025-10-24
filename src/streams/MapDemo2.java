package streams;

import java.util.Arrays;
import java.util.List;

public class MapDemo2 {
	
	public static void main(String[] args) {
		List<String> vehicles= Arrays.asList("bus", "car", "bicycle", "flight", "train");
		
		// without using streams
	/*	for(String name:vehicles) {
			System.out.println(name.length());
		}
		*/
		
		
		// with java streams
		vehicles.stream().map(n -> n.length()).forEach(System.out:: println);
		
		
	}

}
