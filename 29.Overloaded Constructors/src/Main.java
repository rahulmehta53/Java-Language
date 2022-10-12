
public class Main {

	public static void main(String[] args) {
		// overload constructor =  	multiple constructros within a class with the same time
		//							but have different parameters
		//							name + parameters = signature

		Pizza pizza = new Pizza("thicc crust","tomato","mozzerella");
		// will show null for the arguments not passed
		
		System.out.println("these are the ingredients of your pizza :");
		System.out.println(pizza.bread);
		System.out.println(pizza.sauce);
		System.out.println(pizza.cheese);
		System.out.println(pizza.topping);
	}

}
