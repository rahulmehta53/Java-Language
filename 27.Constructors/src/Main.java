
public class Main {

	public static void main(String[] args) {
		// constructor = special method that is called when an object is instantiated
		
		Human human1 = new Human("Rick",34,67); // assign value to constructor
		Human human2 = new Human("Morgan",3,27);
		
		System.out.println(human2.name);
		
		human2.eat();
		human1.drink();

	}

}
