
public class Main {

	public static void main(String[] args) {
		// method - a block of code that is executed whenever it is called upon
		String name = "Rahul";
		int age = 24;
		hello(name, age);  // arguments -- 
		
		
		int x=4;
		int y= 24;
		System.out.println(add(x,y));
	}
	
	
	static void hello(String name, int age) {
		System.out.println("Hello " + name+ ", you are "+age+ " years old.");
	}
	static int add(int x, int y) { // int return type
		return x+y;
		
		
	}
}
