import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * @author hewner
 *
 */
public class MinesweeperMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		MinesweeperGame game = new MinesweeperGame();

		//for your testing:
		System.out.println("Shhh!  Don't tell anyone but the board is:");
		System.out.println(game.getSecretBoardSetup());
		
		JFrame frame = new JFrame("Minesweeper");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

		frame.setPreferredSize(new Dimension(575,400));
		frame.pack();
		frame.setVisible(true);

	}

}
