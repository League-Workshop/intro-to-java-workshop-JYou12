package section2;

import org.jointheleague.graphical.robot.Robot;

public class DrawSquare {

	public static void main(String[] args) {
		
		Robot bob = new Robot();
		bob.setSpeed(500);
		bob.penDown();
		bob.move(200);
		bob.turn(90);
		bob.move(200);
		bob.turn(90);
		bob.move(200);
		bob.turn(90);
		bob.move(200);
		bob.penUp();
		bob.move(200);

		
	}
	
}
