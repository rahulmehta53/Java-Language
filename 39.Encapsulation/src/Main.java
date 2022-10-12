
public class Main {

	public static void main(String[] args) {
		// encapsulation =	attributes of a class will be hidden or private,
		//					Can be accessed only through methods (getters & setters)
		//					You should make attributes private if you don't have a reason to make it public
		
		Car car = new Car("Chevrolet","F-150",2020);
		
//		System.out.println(car.make); // not visible as it's private
		
		System.out.println(car.getMake());
		System.out.println(car.getModel());
		System.out.println(car.getYear());
		
		car.setMake("Camaro");
		System.out.println();
		System.out.println(car.getMake());
		System.out.println(car.getModel());
		System.out.println(car.getYear());
	}

}
