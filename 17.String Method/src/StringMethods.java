
public class StringMethods {

	public static void main(String[] args) {
		// String = a reference data type that can store one or more characters 
		// 			reference data types have access to useful methods
		
		String name = "Rahul";
		
		boolean result = name.equals("Rahul");  // gives true is name matches , case sensitive
//		boolean result = name.equalsIgnoreCase("rahul"); // case insensitive
//		int result = name.length(); //5
//		char result = name.charAt(0); //R
//		int result = name.indexOf('a'); //1
//		boolean result = name.isEmpty(); //false
//		boolean result = name.isBlank(); // Returns true if the string is empty or contains only white space codepoints,otherwise false.
//		String result = name.toUpperCase(); //RAHUL
//		String result = name.toLowerCase(); //rahul
//		String result = name.trim(); // "   Rahul   " ---> Rahul  -- after and before all space trimmed
//		String result = name.replace('h','a');
		
		System.out.println(result);
		
		
	}

}
