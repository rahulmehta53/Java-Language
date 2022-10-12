package package2;
import package1.*;

public class Asub extends A{

	public static void main() {
		C c =new C();
		System.out.println(c.defaultMessage);  // accessible within package
		
		Asub asub = new Asub();
		System.out.println(asub.protectedMessageA);
		
		
	}
	
	
}
