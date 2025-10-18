package streams_LambdaExpresssion;

@FunctionalInterface
interface Car2
{
	public String bookCab(String source, String destination);
}

class Ola implements Car2{

	
	public String bookCab(String source, String destination) {
		System.out.println("Ola car is booked "+source+" To "+destination);
		 return ("Price: 5000 rs");
	}
}


public class Test3 {

	public static void main(String[] args) {
		
//		Car2 cab = new Ola();
//		System.out.println(cab.bookCab("Pune", "Bengluru"));
		
		Car2 cab = (source, destination) -> {
			System.out.println("Ola car is booked "+source+" To "+destination);
			return ("Price: 5000 rs");
		 };
		 System.out.println(cab.bookCab("Pune", "Bengluru"));
	}

}
