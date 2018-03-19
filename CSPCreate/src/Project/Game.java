package Project;
import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
public class Game extends Canvas {
	boolean isRunningGame = true;
	boolean firstRun = true;
	int playerSpeed;
	Ship player = new Ship("", 400,400, 20);

public void startGame(){

			//setUp screen
			JFrame gameFrame = new JFrame("Game Name"); //TODO change name

			JPanel panel = (JPanel)gameFrame.getContentPane();

	//create game objects
			Ship player = new Ship("", 400,400, 20);

}

	public void runGame() {
			

	}

	public static void main(String[] args) {
		//creates game object
		Game game = new Game();
			//runs game object

			game.runGame();

	}

}
