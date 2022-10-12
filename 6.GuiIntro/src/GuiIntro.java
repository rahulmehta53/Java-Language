import javax.swing.JOptionPane;

public class GuiIntro {

	public static void main(String[] args) {
		// using j option pane class
		String name = JOptionPane.showInputDialog("Enter your name");
		JOptionPane.showMessageDialog(null,"Hello "+name );
		
		int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
		JOptionPane.showMessageDialog(null,"You are "+age+" years old");
		
		double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height in cms"));
		JOptionPane.showMessageDialog(null,"You are "+height+" cms tall");
		
	}

}
