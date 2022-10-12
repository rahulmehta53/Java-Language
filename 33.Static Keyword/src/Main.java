
public class Main {

	public static void main(String[] args) {
		// static = modifier. A single copy of a variable/method is created and shared
		// 			The class "owns" the static member // there is only one copy
		
		Friend friend1 = new Friend("spongbob");
		Friend friend2 = new Friend("Patrick");
		Friend friend3 = new Friend("Squidward");
		Friend friend4 = new Friend("Sandy");
		
		
		System.out.println(Friend.numberOfFriends);//no need to make a object as the class itself owns the var.
		
		System.out.println(friend1.numberOfFriends);
		// will work but not preferred as the static field Friend.numberOfFriends should be accessed in a static way
		
		Friend.displayFriends();
		

	}

}
