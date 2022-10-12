import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		//exception = 	an event that occurs during the execution of a program that,
		// 				disrupts the normal flow of instructions
		
		Scanner scanner = new Scanner(System.in);

		try {// dangerous code to be put in try ---> like divide by zero
			
			System.out.println("Enter a whole number to divide: ");
			int x = scanner.nextInt();
			
			System.out.println("Enter a whole number to divide by: ");
			int y = scanner.nextInt();
			
			int z = x/y;
			System.out.println("result: "+z);
		}//good practice to type individual exceptions
		catch(ArithmeticException e) {
			System.out.println("You can't divide by zero! IDIOT!");
		}
		catch(InputMismatchException e) {
			System.out.println("PLEASE ENTER A NUMBER OMFG!!");
		}
		catch(Exception e) {// catch all exception - lazy to use  | last resort
			System.out.println("Something went wrong!!");
		}finally {
			System.out.println("this is always printed");
			scanner.close(); // good practice to close scanner in 
		}
	}
}