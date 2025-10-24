package streams;

import java.util.HashSet;
import java.util.Set;

public class Stream_MethodsDemo2 {

	public static void main(String[] args) {
		//anyMatch() 
		//allMatch()
		//noneMatch()
		
		
		Set<String> fruits= new HashSet<String>();
		fruits.add("One apple");
		fruits.add("One mango");
		fruits.add("Two apples");
		fruits.add("More grapes");
		fruits.add("Two gauvas");
		
		//anyMatch()
		boolean result= fruits.stream().anyMatch(value -> {return value.startsWith("One");});
		System.out.println(result);
		
		//allMatch()
		boolean result1= fruits.stream().allMatch(value -> {return value.startsWith("One");});
		System.out.println(result1);
		
		//noneMatch()
		boolean result2= fruits.stream().allMatch(value -> {return value.startsWith("One");});
		System.out.println(result2);

	}

}
