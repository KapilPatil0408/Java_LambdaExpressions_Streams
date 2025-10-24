package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Stream_MethodsDemo3 {

	public static void main(String[] args) {
		
		//findAny()
		//findFirst()
		
		List<String> stringList = Arrays.asList("one", "two", "three", "four", "five");
		
		Optional<String> ele= stringList.stream().findAny();
		System.out.println(ele.get());
		
		Optional<String> ele1= stringList.stream().findFirst();		
		System.out.println(ele1.get());
	}

}
