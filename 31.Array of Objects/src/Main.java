
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//normal method to initialize array
		int[] numbers = new int [3];
		char[]	characters = new char[4];
		String[] strings = new String[5];
		
		//array of objects
	   	Food[] refrigerator = new Food[3];
	   	
	   	Food food1 = new Food("pizza");
	   	Food food2 = new Food("hamburgers");
	   	Food food3 = new Food("lithi chokha");
	   	
	   	refrigerator[0] = food1;
	   	refrigerator[1] = food2;
	   	refrigerator[2] = food3;
	   	
	   	System.out.println(refrigerator[0].name);
	   	System.out.println(refrigerator[1].name);
	   	System.out.println(refrigerator[2].name);
	   	
	   	
	   	// easier way 
	   	Food[] fridge = {food1,food2,food3};
	   	System.out.println();
	   	System.out.println(fridge[0].name);
	   	System.out.println(fridge[1].name);
	   	System.out.println(fridge[2].name);
		
		
	}

}
