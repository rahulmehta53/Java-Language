
public class Arrays {

	public static void main(String[] args) {
		// array = used to store multiple values in a single variable
		
		String[] cars = {"Camaro","Corvette","Tesla","BMW"}; // must be of the same data type
		
		cars[0]="mustang";
		System.out.println(cars[0]);
		
		
		// another way to initiate array
		String[] trees = new String[3];
		trees[0]="banyan";
		trees[1]="Mahogony";
		trees[2]="Sal";
		for(int i=0;i<trees.length;i++) {
			System.out.println(trees[i]);
		}

}
}
