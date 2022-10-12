
public class Main {

	public static void main(String[] args) {
		//toString method	=	special method that all objects inherit,
		//						that returns a string that "textually represent" an object
		//						can be used both implicitly and explicitly
		
		Car car = new Car();
		
//		System.out.println(car.make);
//		System.out.println(car.model);
//		System.out.println(car.year);
//		System.out.println(car.color);
		
//		System.out.println(car); // before addition of toString method in Car class
		//Car@2c7b84de- address of the car object in the memory 
		
		System.out.println(car.toString()); // explicitly use of toString method
		System.out.println(car); // implicitly using the toString method

	}

}
