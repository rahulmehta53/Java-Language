
public class Main {

	public static void main(String[] args) {
		// printf() =	an optional method to control, format, and display text to the console window
		//				two argument = format string + (object/variable/value)
		//				%[flags][precision][width][conversion-character]

//		System.out.printf("This is format string %d", 1233333);
		
		// some conversion characters
		boolean myBoolean =true;
		char myChar = 'a';
		String myString ="Rahul";
		int myInt = 24;
		double myDouble = 2343.23;
		
//		System.out.printf("%b",myBoolean); //b for boolean
//		System.out.printf("%c",myChar);		//c for c
//		System.out.printf("%s",myString);	//s for string
//		System.out.printf("%d",myInt);		//d for decimal
//		System.out.printf("%f",myInt);		//f for floating type
		
		//[width]
		//sets number of digits of precision when outputting floating-point values
//		System.out.printf("Hello %10s ", myString); //Hello      Rahul -- including the space
//		System.out.printf("Hello %-10s ", myString);//Hello Rahul      -- including the space
		
		//[precision]
		//sets number of digits of precision when outputting floating-point values
//		System.out.printf("You have this much money %.1f",myDouble); //2343.2
		
		//[flags]
		//adds an effect to output based on the flag added to format specifier
		// 1. - : left-justify
		// 2. + : output a plus ( + ) or minus ( - ) sign for a numeric value
		// 3. 0 : numeric values are zero-padded
		// 4. , : comma grouping separator if numbers > 1000
		
		System.out.printf("You have this much money %020f", myDouble); //0000000002343.230000-- 3
		System.out.println();
		System.out.printf("You have this much money %20f", myDouble); //         2343.230000-- 1
		System.out.println();
		System.out.printf("You have this much money %+f", myDouble); //+2343.230000--- 2
		System.out.println();
		System.out.printf("You have this much money %,f", myDouble); //2,343.230000--- 4
		
		
		
		
	}

}
