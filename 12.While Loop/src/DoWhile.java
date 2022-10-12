import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String name = "";
		  // will execute once whether condition is true or false 
		do {
		  System.out.print("Enter your name: "); 
		  name = scanner.nextLine();
		  }while(name.isBlank());
		 

		System.out.println("Hello " + name);
	}

}
