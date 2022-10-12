import java.io.File;

public class Main {
	public static void main(String[] args) {
		// file = An abstract representation of file and directory pathnames
		
		File file = new File("secret_message.txt"); // paste in project folder not in src folder
//		File file1 = new File("C:/Users/rahul/Desktop/secret_message.txt"); // \\double backslash or single /
		
		if(file.exists()) {
			System.out.println("That file exists :0!");
			System.out.println(file.getPath());
			System.out.println(file.getAbsolutePath());
			System.out.println(file.isFile());
//			file.delete(); // will delete the file
		}
		else {
			System.out.println("That file doesn't exist :(");
		}
		
		
//		if(file1.exists()) {
//			System.out.println("That file exists :0!");
//		}
//		else {
//			System.out.println("That file doesn't exist :(");
//		}
	}
}
