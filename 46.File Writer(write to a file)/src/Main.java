import java.io.FileWriter;
import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		
		try {
			FileWriter writer = new FileWriter("poem.txt");
			// will overwrite if the file already exists
			writer.write("Roses are red \nViolets are blue \nBooty booty booty booty \nRockin' everywhere!");
			writer.append("\n 	~~Written by Rahul");
			writer.close();
			
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}
