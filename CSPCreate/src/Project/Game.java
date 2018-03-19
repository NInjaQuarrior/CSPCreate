package Project;
import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
public class Game extends Canvas {
	boolean isRunningGame = true;
	boolean firstRun = true;

	
	public void runGame() {
		JFrame gameFrame = new JFrame("Game Name"); //TODO change name
		
		JPanel panel = (JPanel)gameFrame.getContentPane();
		
	}

	public static void main(String[] args) {
		//creates game object
		Game game = new Game();
			//runs game object
	
			game.runGame();
	
	}
	
}
