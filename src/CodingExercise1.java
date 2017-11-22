import java.awt.Color;
import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

/* Level 0 Exam: Coding  Exercise #1 */
public class CodingExercise1 {

	public static void main(String[] args) {
		Robot bob = new Robot();
		// 3. ask the user what color they would like the Robot to draw
		String color = JOptionPane.showInputDialog("What color would you like me to draw a square in? Green or Red?");
		// 4. use an if/else statement to set the pen color that the user requested
		// (minimum of 2 colors)
		if (color.equalsIgnoreCase("red")) {
			bob.setPenColor(255, 44, 44);
		} else if (color.equalsIgnoreCase("green")) {
			bob.setPenColor(44, 255, 44);
		} else {
			JOptionPane.showMessageDialog(null, "ERROR!!!!!YOU DID NOT CHOOSE ONE OF THE OPTIONS!!!!! "
					+ "I will pick the color for you. I will draw it in... green.");
			bob.setPenColor(44, 255, 44);
		}
		// 2. set the pen width to 10
		bob.setPenWidth(10);
		// 1. make the Robot draw a shape
		bob.penDown();
		bob.setSpeed(1000);
		bob.move(100);
		bob.turn(90);
		bob.move(100);
		bob.turn(90);
		bob.move(100);
		bob.turn(90);
		bob.move(100);
	}

}
