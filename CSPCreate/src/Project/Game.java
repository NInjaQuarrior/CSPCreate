package Project;
import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
public class Game extends Canvas {
	boolean isRunningGame = true;
	boolean firstRun = true;
	int playerSpeed;


	public void runGame() {
		JFrame gameFrame = new JFrame("Game Name"); //TODO change name

		JPanel panel = (JPanel)gameFrame.getContentPane();








		//create game objects
		Ship player = new Ship(400, 400, playerSpeed,"", 20, );
	}

	public static void main(String[] args) {
		//creates game object
		Game game = new Game();
			//runs game object

			game.runGame();

	}

}
