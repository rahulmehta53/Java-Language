
public class IfStatements {

	public static void main(String[] args) {
//		if statement = performs a block of code if it's condition evaluates to be true
//		<=, >= are comparison operators , so to compare we use == not =(assignment operator)
		int age = 76;
		if (age>=75){
			System.out.println("Ok BOomer!!");
		}
		else if(age>=18){
			System.out.println("You are a adult!!");
		}
		else if(age>=13){
			System.out.println("You are a teenager!!");
		}
		else {
			System.out.println("You are not a adult!");
		}
	}

}
