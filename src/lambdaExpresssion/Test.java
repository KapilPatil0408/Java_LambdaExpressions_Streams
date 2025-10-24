package lambdaExpresssion;

@FunctionalInterface
interface Cab
{
	public void bookCab();
}

//class Ola implements Cab{
//
//	
//	public void bookCab() {
//		System.out.println("Ola car is booked....");
//	}
//	
//
//	
//}


public class Test {

	public static void main(String[] args) {
		
		//Ola cab = new Ola();
		Cab cab= () -> System.out.println("Ola car is booked....");
		cab.bookCab();

	}

}
