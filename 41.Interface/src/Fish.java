
public class Fish implements Prey,Predator{// more than one interface
		
	@Override
	public void hunt() {
		System.out.println("This fish is hunting smaller fish!!");		
	}
	
	@Override
	public void flee() {
		System.out.println("This fish is fleeing bigger fish!!");	
		
	}
}
