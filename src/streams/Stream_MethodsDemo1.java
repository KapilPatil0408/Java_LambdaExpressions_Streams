package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Stream_MethodsDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list1= Arrays.asList(2,4,1,3,7,5,9);
		
		//sorted -- ascending order
		List<Integer> sortedList= list1.stream().sorted().collect(Collectors.toList()); 
		System.out.println(sortedList); 
		
		
		//sorted -- ascending order
		List<Integer> sortedList1=list1.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(sortedList1); 
		
		
		//String 
		List<String> list2= Arrays.asList("Mery", "John", "Kim", "David", "Smith");
		List<String> sortedList2=list2.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedList2);
		
		List<String> reverseSortedList2=list2.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(reverseSortedList2);
		

	}

}
