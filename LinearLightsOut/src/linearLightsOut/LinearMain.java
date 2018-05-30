package linearLightsOut;

import java.awt.BorderLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 * Runs the Linear Lights Out application.
 * 
 * @author Yuankai Wang. Created Jan 18, 2010.
 */
public class LinearMain {

	/**
	 * Starts here.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		String nButtonsString = JOptionPane.showInputDialog("How many buttons would you like?");
		int nButtons = Integer.parseInt(nButtonsString);
		JFrame myFrame = new JFrame();
		// you'll want to think about how you want to manage the state of the
		// game
		// also you want to add some buttons and stuff
		myFrame.setTitle("Linear Lights Out!");
		ArrayList<JButton> buttons = new ArrayList<JButton>();
		JPanel myPanel1 = new JPanel();
		JPanel myPanel2 = new JPanel();
		// Add X and O Buttons
		for (int i = 0; i < nButtons; i++) {
			double a = Math.random();
			JButton oxButton = new JButton("O");
			if (a < 0.5) {
				oxButton.setText("O");
			} else {
				oxButton.setText("X");
			}
			myPanel1.add(oxButton);
			buttons.add(oxButton);
			PlayGameActionListener playGameListener = new PlayGameActionListener(buttons, oxButton, nButtons);
			oxButton.addActionListener(playGameListener);
		}
		// new game button and quit button
		JButton newGameButton = new JButton("New Game");
		JButton quitButton = new JButton("Quit");
		NewGameActionListener newGameListener = new NewGameActionListener(buttons);
		newGameButton.addActionListener(newGameListener);
		QuitActionListener quitListener = new QuitActionListener();
		quitButton.addActionListener(quitListener);
		myPanel2.add(newGameButton);
		myPanel2.add(quitButton);
		myFrame.add(myPanel1, BorderLayout.NORTH);
		myFrame.add(myPanel2, BorderLayout.SOUTH);
		myFrame.pack();
		myFrame.setVisible(true);
	}
}
