package section3;

import java.awt.Color;

import javax.swing.JOptionPane;

import com.sun.xml.internal.bind.v2.runtime.Name;

public class Greeter {

	public static void main(String[] args) {
		
		
		
		String main = JOptionPane.showInputDialog("What is your name?");
		
		JOptionPane.showMessageDialog(null, "Hi, " + main + "I am bob");
		
	}
	
}
