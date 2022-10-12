
public class ForWhile {

	public static void main(String[] args) {
		// for loop = executes a block of code a limited amount of times
		
		for(int i=0; i<=10;i++) {
			System.out.println(i);
		}
		
		
		
		for(int i=10; i>=0;i--) {
			System.out.println(i);
		}
		System.out.println("Happy New Year");
		
		
		
		for(int i=10; i>=0;) {// remember to put ; after till statement
			System.out.println(i);
			i-=3; // update statement in body
		}
		System.out.println("Happy New Year");

	}

}
