
public class Dog extends Animal {
	
	
	@Override  // not necessary but considered a good practice to add @Override annotation
	void speak() {
		System.out.println("The dog goes *bark*!!");
	}
}
