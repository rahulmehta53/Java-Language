import java.util.Random;

public class DiceRoller {
	//or declare random and number as global variable
//	Random random; // also instantiate it in constructor
//	int number;
	
	DiceRoller(){
		Random random = new Random(); // local to constructor
		int number = 0; // local to constructor 
		// constructor counts as a method -- soln. pass argu. and object to a method(here roll method)
		roll(random, number);	
	}
	
	void roll(Random random,int number) {
		number = random.nextInt(6)+1;  // random cannot be resolved 
		System.out.println(number);
		
	}
}
