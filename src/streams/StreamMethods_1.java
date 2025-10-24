package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMethods_1 {

	//distinct()  limit()        ---> Non terminal / processing methods
	//count()     forEach()      ---> terminal method
	public static void main(String[] args) {
	
		List<String> vehiclesList= Arrays.asList("bus","car","bicycle", "bus", "car", "bike");
		
		//distinct()
	/*	List<String> distinctVehicles= vehiclesList.stream().distinct().collect(Collectors.toList());
		System.out.println(distinctVehicles);
		*/
		
		vehiclesList.stream().distinct().forEach(value -> System.out.print(value));
		
		
		//count()
		long count = vehiclesList.stream().distinct().count();
		System.out.println(count);
		
		
		//limit()
		List<String> limitedVehiclesList= vehiclesList.stream().limit(3).collect(Collectors.toList());
		System.out.println(limitedVehiclesList);
		
		
		
	}

}
