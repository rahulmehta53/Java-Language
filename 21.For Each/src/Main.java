import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
//		for-each = traversing technique to iterate through the element in an array/collection
//				   less steps, more readable
//				   less flexible
		
//		String[] animals = {"cat","dog","rat","bird"};
		ArrayList<String> animals = new ArrayList();
		animals.add("cat");
		animals.add("bird");
		animals.add("rat");
		animals.add("dog");
		
		for(String i : animals) { // datatype index in of our array/collection
			System.out.println(i);
		}
		
	}

}
