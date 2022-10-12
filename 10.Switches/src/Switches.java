
public class Switches {

	public static void main(String[] args) {
		// switch = statement that allows a variable to be tested for equality against a list of values
		
		String day = "Friday";
//		if you are using a lot of if statements , use switch instead
		switch(day) {
		case "Sunday" : System.out.println("It's Sunday!!");
		break;
		case "Monday" : System.out.println("It's Monday");
		break;
		case "Tuesday" : System.out.println("It's Tuesday!!");
		break;
		case "Wednesday" : System.out.println("It's Wednesday");
		break;
		case "Thrusday" : System.out.println("It's Thrusday!!");
		break;
		case "Friday" : System.out.println("It's Friday");
		break;
		case "Saturday" : System.out.println("It's Saturday!!");
		break;
		default: System.out.println("That is not a day!");
		}
		
		

	}

}
