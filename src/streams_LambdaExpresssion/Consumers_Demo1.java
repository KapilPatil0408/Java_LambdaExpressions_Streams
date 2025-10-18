package streams_LambdaExpresssion;

import java.util.function.Consumer;

public class Consumers_Demo1 {

	
	public static void main(String[] args) {
		Consumer<String> c= s -> System.out.println(s);
		c.accept("Welcome");	
	}
}
