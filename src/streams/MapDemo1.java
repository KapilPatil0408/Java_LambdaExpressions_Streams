package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo1 {
	
	public static void main(String[] args) {
		List<String> vehicles= Arrays.asList("bus", "car", "bicycle", "flight", "train");
		List<String> vehicleNameUpperCase= new ArrayList<String>();
		
		// without java streams
	/*	for(String name: vehicles) {
			vehicleNameUpperCase.add(name.toUpperCase());
		}
			*/	
		System.out.println(vehicleNameUpperCase);

		
		vehicleNameUpperCase = vehicles.stream().map(name -> name.toUpperCase()).collect(Collectors.toList());
		System.out.println(vehicleNameUpperCase);
	}

}
