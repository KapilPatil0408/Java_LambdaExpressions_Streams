package streams_LambdaExpresssion;

import java.util.function.Consumer;


public class Consumers_Demo3 {

	public static void main(String[] args) {
	
		Consumer<String> c= s -> System.out.println(s+" "+ "is white");
		Consumer<String> c1= s-> System.out.println(s+" "+ "is having four legs");
		Consumer<String> c2= s-> System.out.println(s+" "+ "is eating grass");
		
		/*
		 * c.accept("Cow");
		 *  c1.accept("Cow"); 
		 *  c2.accept("Cow");
		 */
		
		
	 //	c.andThen(c1).andThen(c2).accept("Cow");
		
		Consumer<String> c3= c.andThen(c1).andThen(c2);
		c3.accept("Cow");
	}

}
