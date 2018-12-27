package section4;

import java.util.Random;

import javax.swing.JOptionPane;

public class AwesomeOrNot {

	// 1. Make a main method that includes all the steps below…
public static void main(String[] args) {
	
	Random random = new Random();
	int rand = random.nextInt(4);
	
	
	
 System.out.println(random);
	// 4. Get the user to enter something that they think is awesome
	String item = JOptionPane.showInputDialog("What is something you think is AWSOME!");
	// 5. If the random number is 0
	if (rand == 0) {
		JOptionPane.showMessageDialog(null, item + " is AWSOME");
	}
	// -- tell the user whatever they entered is awesome!

	// 6. If the random number is 1
	if (rand == 1) {
		JOptionPane.showMessageDialog(null, item + " is OK");
	}
	// -- tell the user whatever they entered is ok.

	// 7. If the random number is 2
	if (rand == 2) {
		JOptionPane.showMessageDialog(null, item + " is boring");
	}
	// -- tell the user whatever they entered is boring.

	// 8. If the random number is 3
	if (rand == 03) {
		JOptionPane.showMessageDialog(null, item + " is just dumb");
	}
	// -- write your own answer
	}
}


