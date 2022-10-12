
public class Main {

	public static void main(String[] args) {
		// overloaded methods = methods that share the same name but have different parameters
//								method name + parameters = method signature
		
		int a = add(1,2,4);		// why on initialization is it giving value??
		double b = add(1.5,2.5,4.7); // needs to be double
//		the data type, order, and the number of variables is taken in account
		System.out.println(a);
		System.out.println(b);
		

	}
	
	
	static int add(int x, int y) {
		System.out.println("This is overloaded method #1");
		return x+y;
		}
	
	static int add(int x, int y, int z) {
		System.out.println("This is overloaded method #2");
		return x+y+z;
		}

	static int add(int x, int y, int z,int a) {
		System.out.println("This is overloaded method #3");
		return x+y+z+a;
		}
	static double add(double x, double y) {
		System.out.println("This is overloaded method #4");
		return x+y;
	}
	
	static double add(double x, double y, double z) {
		System.out.println("This is overloaded method #5");
		return x+y+z;
	}
	
	static double add(double x, double y, double z,double a) {
		System.out.println("This is overloaded method #6");
		return x+y+z+a;
	}
	

}
