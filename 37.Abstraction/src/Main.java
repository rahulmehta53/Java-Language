
public class Main {

	public static void main(String[] args) {
		// abstract = abstract classes cannot be instantiated, but they can have a subclass
		//				abstract methods are created without an implementation
		
//		Vehicle vehicle  = new Vehicle(); // cannot be instantiated as Vehicle class is abstract
		Car car = new Car();
		
		car.go();
	}

}
