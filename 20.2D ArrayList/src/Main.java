import java.util.*;

public class Main {

	public static void main(String[] args) {
//		2D ArrayList  = a dynamic list of lists
//		You can change the size of these lists during runtime
		ArrayList<ArrayList<String>> groceryList = new ArrayList();
		
		ArrayList<String> bakeryList = new ArrayList();
		bakeryList.add("pasta");
		bakeryList.add("garlic bread");
		bakeryList.add("donuts");
		
		ArrayList<String> drinksList = new ArrayList();
		drinksList.add("soda");
		drinksList.add("coffee");
		drinksList.add("protein shake");
		
		ArrayList<String> productsList = new ArrayList();
		productsList.add("tomatoes");
		productsList.add("capsicum");
		
		// to add all the lists to the groceryList
		groceryList.add(bakeryList);
		groceryList.add(drinksList);
		groceryList.add(productsList);
		
		System.out.println(groceryList);
		System.out.println(groceryList.get(2));
		System.out.println(groceryList.get(2).get(0));

	}

}
