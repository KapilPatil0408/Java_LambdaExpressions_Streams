package streams_LambdaExpresssion;

@FunctionalInterface
interface Car
{
	public void bookCab(String source, String destination);
}

//class Ola implements Car{
//
//	
//	public void bookCab(String source, String destination) {
//		System.out.println("Ola car is booked "+source+" To "+destination);
//	}
//}


public class Test2 {

	public static void main(String[] args) {
		
		//Ola cab = new Ola();
		Car cab= (source, destination) -> System.out.println("Ola car is booked from "+source+" To "+destination);
		cab.bookCab("Pune", "Mumbai");

	}

}
