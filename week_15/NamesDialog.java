package week_15;

import javax.swing.JOptionPane;

public class NamesDialog {

	public static void main(String[] args) {
		String firstName;
		String middleName;
		String lastName;
		
		firstName = 
				JOptionPane.showInputDialog("Waht is " + "your first name ");
		middleName =
				JOptionPane.showInputDialog("What is " + " your middle name");
		lastName = 
				JOptionPane.showInputDialog("What is " + "your last name ");
		
		JOptionPane.showConfirmDialog(null,  "Hello " + firstName + " " + middleName + " " + lastName);
		
		System.exit(0);

	}

}
