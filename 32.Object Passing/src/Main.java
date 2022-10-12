
public class Main {

	public static void main(String[] args) {
		// pass objects as arguments
		
		Garage garage = new Garage();
		
		Car car1 = new Car("BMW");
		Car car2 = new Car("Tesla");
		
		garage.park(car1); // sending car1 object in garage
		garage.park(car2); // sending car2 object in garage
	}

}
