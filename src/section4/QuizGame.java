package section4;

import javax.swing.JOptionPane;
import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class QuizGame {
	
	public static void main(String[] args) {
		
		int score = 0;
		String Q1 = JOptionPane.showInputDialog("What is Sailor in latin");
		if (Q1.equalsIgnoreCase("nauta")) {
			score +=1;
		}
		String Q2 = JOptionPane.showInputDialog("Who was the secound president of the USA");
		if (Q1.equalsIgnoreCase("John Adams")) {
			score +=1;
		}
		String Q3 = JOptionPane.showInputDialog("What is flumen mean");
		if (Q1.equalsIgnoreCase("river")) {
			score +=1;
		}
		String Q4 = JOptionPane.showInputDialog("What is 12 X 12");
		if (Q1.equalsIgnoreCase("144")) {
			score +=1;
		}
		String Q5 = JOptionPane.showInputDialog("What is soldier in latin");
		if (Q1.equalsIgnoreCase("miles")) {
			score +=1;
		}
		String Q6 = JOptionPane.showInputDialog("Will you rule the world");
		if (Q1.equalsIgnoreCase("no")) {
			score +=1;
		}
		String Q7 = JOptionPane.showInputDialog("How many cards are in a deck");
		if (Q1.equalsIgnoreCase("52")) {
			score +=1;
		}
		String Q8 = JOptionPane.showInputDialog("What is the name of the creator of this quiz");
		if (Q1.equalsIgnoreCase("Joshua")) {
			score +=3;
		}
		String Q9 = JOptionPane.showInputDialog("What company owns siri");
		if (Q1.equalsIgnoreCase("apple")) {
			score +=1;
		}
		// 6.  After all the questions have been asked, print the user's score 
		speak(score);
		

		
	}		
		static void speak(int score) {
			try {
				Runtime.getRuntime().exec("say ").waitFor();
			}
			catch (Exception e) {
				e.printStackTrace();
			}
}
}
