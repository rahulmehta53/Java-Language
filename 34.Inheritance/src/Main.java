
public class Main {

	public static void main(String[] args) {
		// inheritance = the process where one class acquires, 
		//				the attributes and methods of another.
		
		Car car = new Car();
		car.go();
		System.out.println(car.doors);
		
		Bicycle bicycle = new Bicycle();
		bicycle.stop(); // common to both Car and Bicycle
		System.out.println(bicycle.padals); // unique to Bicycle
		

	}

}
