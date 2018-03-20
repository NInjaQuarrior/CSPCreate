package Project;
import java.awt.*;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyAdapter;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Game extends Canvas {
	boolean isRunningGame = true;
	boolean firstRun = true;
	int playerSpeed;
	Ship player = new Ship("", 400,400, 20);
	Shot shot = new Shot("", 20);


public void startGame(){

			//setUp screen
			JFrame gameFrame = new JFrame("Game Name"); //TODO change name

			JPanel panel = (JPanel)gameFrame.getContentPane();

			panel.setVisible(true);
//TODO
		//	addKeyListener(new keyInputHandle());

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
