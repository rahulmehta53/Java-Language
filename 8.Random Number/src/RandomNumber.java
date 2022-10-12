import java.util.Random;

public class RandomNumber {

	public static void main(String[] args) {
		Random random = new Random();
		
//		int x = random.nextInt(6)+1; //random creates a number b/w 0 and the n-1 so, +1 is added
//		double y = random.nextDouble();
		boolean z = random.nextBoolean();
		
		System.out.println(z);

	}

}
