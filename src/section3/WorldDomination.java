package section3;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;

public class WorldDomination {
	
	public static void main(String[] args) {
		// 1. Ask the user if they know how to write code.
		String yn = JOptionPane.showInputDialog("Do you know how to code? \n \n \n (say no)");
		// 2. If they say "yes", tell them they will rule the world.
		if(yn.equalsIgnoreCase("yes")) {
			JOptionPane.showMessageDialog(null, "You will rule the WORLD!!!!!!!!");
		}else {
		// 3. Otherwise, wish them good luck washing dishes.
			JOptionPane.showMessageDialog(null, "Good luck washing dishes! ;)");
		}
	}
}

