
public class Main {

	public static void main(String[] args) {
		// polymorphism = greek word for poly-"many", morph-"form"
		// 					The ability of an object to identify as more than one type
		
		Car car = new Car();
		Bicycle bicycle = new Bicycle();
		Boat boat = new Boat();
		
		Vehicle[] racers = {car,bicycle,boat}; //object in a array --> find out what they have in common
		Object[] racer = {car,bicycle,boat}; //object in a array --> find out what they have in common
		
//		car.go();
//		bicycle.go();
//		boat.go();
		
		for(Vehicle x : racers) {
			x.go();
		}
		
		
//		SEE THIS LATER
//		for(Object y : racer) {
//			y.go();
//		}
		
	}

}
