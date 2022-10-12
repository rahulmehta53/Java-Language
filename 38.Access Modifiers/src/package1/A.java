package package1;
import package2.*;

public class A {
	// Modifier		Class		Package		Subclass		World
	//	-----------------------------------------------------------
	// Public		Y			Y			Y				Y
	// Protected	Y			Y			Y				N
	// No Modifier	Y			Y			N				N
	// Private		Y			N			N				N
	
	protected String protectedMessageA = "This is protected"; // not allowed in public static void main()
	
	public static void main(String[] args) {
		C c =new C();// accessible as class C is public. If it's default --> no longer accessible
//		System.out.println(c.defaultMessage); // default Message not accessible outside package
		System.out.println(c.publicMessage); // public Message accessible outside package and to the world
		
		
		B b = new B();
//		System.out.println(b.privateMessageB);  //Error - not visible
	}
}
