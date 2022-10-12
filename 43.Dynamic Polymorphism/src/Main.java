import java.util.Scanner;

public class Main {
	// changed the class template to add main function by default
	public static void main(String[] args) {
		// polymorphism= many shapes/forms
		// dynamic = after compilation (during runtime)
		
		// ex. A corvette is a : corvette, and a car , and a vehicle and an object
		
		Scanner scanner = new Scanner(System.in);
		Animal animal;		
		
		System.out.println("What animal do you want?");
		System.out.println("(1=dog) or (2=Cat)");
		int choice = scanner.nextInt();
		
		if(choice==1) {
			animal = new Dog();
			animal.speech();
		}else if(choice==2){
			animal =new Cat();
			animal.speech();
		}else {
			System.out.println("INVALID CHOICE");
		}
		
	}
}
