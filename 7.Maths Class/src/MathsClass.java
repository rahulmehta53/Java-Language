import java.util.Scanner;

public class MathsClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x = 3.14;
		double y = -24.234;
		
		double z = Math.max(x, y);
		double a = Math.abs(y);
		double b = Math.sqrt(a);
		double c = Math.ceil(b);
		double d = Math.floor(b);
		
		
		System.out.println(z);
		
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		
		System.out.println(Math.max(a,x));
		
//		how to call a function in java
		hypotenuse();
		


	}
	
	public static void hypotenuse() {
		double x;
		double y;
		double z;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter side x: ");
		x = scanner.nextDouble();
		
		System.out.println("Enter side y: ");
		y = scanner.nextDouble();
		
		z=Math.sqrt((x*x)+(y*y));
		System.out.println("The hypotenuse is :"+z);
		scanner.close();
		
		}
	

}
