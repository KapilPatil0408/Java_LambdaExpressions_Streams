package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * ArrayList<Integer> numberList= new ArrayList<Integer>(); numberList.add(10);
		 * numberList.add(15); numberList.add(20); numberList.add(25);
		 * numberList.add(30);
		 */
		List<Integer> numberList = Arrays.asList(10, 15, 20, 25, 30);
		List<Integer> evenNumbersList = new ArrayList<Integer>();
		
		
//Without streams
	/*	for (int n : numberList) {
			if(n % 2==0) {
				evenNumbersList.add(n);
			}
			
			System.out.println(evenNumbersList);
			*/
//with streams
		
	/*	evenNumbersList = numberList.stream().filter(n -> n%2==0).collect(Collectors.toList());
		System.out.println(evenNumbersList);
	*/	
		
	//	numberList.stream().filter(n -> n%2==0).forEach(n -> System.out.println(n));
		
		numberList.stream().filter(n -> n%2==0).forEach(System.out::println);
		
		}

	}


