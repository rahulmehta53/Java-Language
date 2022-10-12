import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String name = "";
		
//		until the condition is true
		while(name.isBlank()) {
			System.out.print("Enter your name: ");
			name = scanner.nextLine();
		}
		
		/*//		will execute once whether condition is true or false
		 * do { System.out.print("Enter your name: "); name = scanner.nextLine();
		 * }while(name.isBlank());
		 */
		
		System.out.println("Hello "+ name);
	}

}
