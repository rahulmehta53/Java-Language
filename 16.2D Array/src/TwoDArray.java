
public class TwoDArray {

	public static void main(String[] args) {
		// 2D array = an array of arrays
		
		/*String[][] cars = new String[3][3];
		
		cars[0][0]="Camaro";
		cars[0][1]="Corvette";
		cars[0][2]="Silverado";
		cars[1][0]="Mustang";
		cars[1][1]="Ranger";
		cars[1][2]="Rivian";
		cars[2][0]="Model T";
		cars[2][1]="Renault";
		cars[2][2]="Kia";*/
		
		String[][] cars = {
				{"Camaro","Corvette","Silverado"},
				{"Mustang","Ranger","Rivian"},
				{"Model T","Renault","Kia"}
				};
		
		for(int i =0; i<cars.length;i++) {
			System.out.println();
			for(int j=0;j<cars.length;j++) {
				System.out.print(cars[i][j]+" ");
			}
		}
		
		
		

	}

}
