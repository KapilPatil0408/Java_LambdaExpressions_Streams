package lambdaExpresssion;

import java.util.Date;
import java.util.function.Supplier;

public class Supplier_Demo1 {
	
	public static void main(String[] args) {
		Supplier<Date> s=()-> new Date();
		System.out.println(s.get());
	}

}
