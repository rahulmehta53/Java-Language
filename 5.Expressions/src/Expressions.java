
public class Expressions {

	public static void main(String[] args) {
//		modulus , increment and decrement , data mismatch
		int friends = 10;
		friends = friends % 2;
		System.out.println(friends);
		
		friends =+ 5;
		double newfriends = (double)friends/4;
		System.out.println(newfriends);

		// friends is int so 1.25 will be considered 1
		friends++;
		System.out.println(friends);
		
		friends--;
		System.out.println(friends);
		
		
	}

}
