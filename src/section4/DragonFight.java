package section4;

import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class DragonFight {
	public static void main(String[] args) {
		
		
		Random random = new Random();
		
		ImageIcon dragon = new ImageIcon("src/section4/dragonPicture.jpg");		
		
		JOptionPane.showMessageDialog(null, "Defeat the dragon to take its treasure!", "Dragon Fighter", 0, dragon);
	int playerHealth = 100;
	int dragonHealth = 100;
	int playerDamage;
	int dragonDamage;
		
		while(playerHealth>0 && dragonHealth>0) {		
		
		String Attack = JOptionPane.showInputDialog("Do you want to attack the dragon with a yell or a kick");
		if (Attack.equalsIgnoreCase("yell")) {

			int yell = random.nextInt(20);
			playerDamage = yell;
			dragonHealth -= playerDamage;
		}
		if (Attack.equalsIgnoreCase("kick")) {
			int kick = random.nextInt(50);

			playerDamage = kick;
			dragonHealth -= playerDamage;
		}
		
		int dd = random.nextInt(75);

		dragonDamage = dd;
		playerHealth -= dragonDamage;
		
		if (Attack.equalsIgnoreCase("Boom")) {
			
			dragonHealth = 0;
			JOptionPane.showMessageDialog(null, "You found an easter egg");
		
			
		}
		
		if (playerHealth <= 0) {
			
			JOptionPane.showMessageDialog(null, "You LOST!");
			
		}else if (dragonHealth <= 0){
			
			JOptionPane.showMessageDialog(null, "You WON!!! \n You got lots of gold");

			
		}else{
			
			JOptionPane.showMessageDialog(null, "Dragon Health " + dragonHealth + "\n Your Health " + playerHealth);
			
			}
		}
	}
}
