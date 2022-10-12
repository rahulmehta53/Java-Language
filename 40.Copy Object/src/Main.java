
public class Main {

	public static void main(String[] args) {
		Car car1 = new Car("Chevrolet","F-150",2020);
		Car car2 = new Car("Ford","Mustang",2022);
		
		System.out.println(car1);
		System.out.println(car2);
		System.out.println();
		System.out.println(car1.getMake());
		System.out.println(car1.getModel());
		System.out.println(car1.getYear());
		
		
//		car1=car2; // now, they will be copied by have the same address | not copied but having same reference
		//pointing to the same object in memory
		
		Car car3 =new Car(car2); // another method to copy with Car constructor overloaded | this.copy(x);
		System.out.println();
		System.out.println(car3.getMake());
		System.out.println(car3.getModel());
		System.out.println(car3.getYear());
		
		car2.copy(car1); 
		//copy method in Car that passes the car2's get to car1's set | this.setMake(x.getMake()); for other attributes also
		System.out.println();
		System.out.println(car2.getMake());
		System.out.println(car2.getModel());
		System.out.println(car2.getYear());
		
		 
		
	}

}
