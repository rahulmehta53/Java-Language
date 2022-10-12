
public class WrapperClass {

	public static void main(String[] args) {
		/*
		 * // wrapper class = provides a way to use primitive data types as reference
		 * data type, reference data types contain useful methods can be used with
		 * collections (ex.ArrayList)  || like the methods we can use with String( in StringMethod)
		 *
		 * dis. --> takes much longer time than primitive data types
		 *
		 * primitive 	wrapper 
		 * ------------ ------------- 
		 * boolean 		Boolean 
		 * char 		Character
		 * int 			Integer 
		 * double 		Double
		 * 
		 * autoboxing = the automatic conversion that the Java compiler makes between
		 * the primitive type and their corresponding wrapper class
		 * 
		 * unboxing = the reverse of autoboxing, Automatic conversion of wrapper class to primitive
		 */
		
		Boolean a = true;
		Character b = '@';
		Integer c = 123;
		Double d = 1234.343;
		String e = "Rahul";
		
		System.out.println(a.equals(b)); // methods accessible to Boolean wrapper class
		
//		Unboxing
		if(a== true) {
			System.out.println("This is true");
		}
		if(b=='@') {
			System.out.println("This is true");
		}
		
		
		
		
		
		
		
	}

}
