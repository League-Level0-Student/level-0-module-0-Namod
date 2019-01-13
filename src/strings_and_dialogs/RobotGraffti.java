package strings_and_dialogs;

import org.jointheleague.graphical.robot.Robot;

public class RobotGraffti {
public static void main(String[] args) {
 
Robot rob = new Robot();
	rob.setSpeed(200);
	rob.penDown();
	 rob.move(200);
	 rob.turn(130);
	 rob.move(300);
	 rob.turn(230);
	 rob.move(200);
}
}