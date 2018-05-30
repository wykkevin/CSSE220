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

	private static class MinesweeperListener implements ActionListener {
		private int row,column;
		private MinesweeperGame game;
		private JLabel label;
		private JButton button;

		public MinesweeperListener(int row, int col, MinesweeperGame game, JLabel label, JButton button) {
			this.row = row;
			this.column = col;
			this.game = game;
			this.label = label;
			this.button = button;
		}

		/* (non-Javadoc)
		 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
		 */
		@Override
		public void actionPerformed(ActionEvent arg0) {
			if(game.hasMine(this.row, this.column)) {
				this.button.setText("X");
				this.label.setText("You lose!");
			} else {
				this.button.setText("" + game.getNeighborMineCount(this.row, this.column));
			}
			
		}
	}
	
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
		
		JLabel label = new JLabel("Enjoy playing minesweeper");
		frame.add(label, BorderLayout.NORTH);
		
		JPanel bigPanel = new JPanel();
		for(int row = 0; row < MinesweeperGame.SIZE; row++) {
			JPanel panel = new JPanel();
			for(int col = 0; col < MinesweeperGame.SIZE; col++) {
				JButton button = new JButton("?");
				panel.add(button);
				button.addActionListener(new MinesweeperListener(row, col, game, label, button));
			}
			bigPanel.add(panel);
		}
		frame.add(bigPanel);
		frame.setPreferredSize(new Dimension(575,400));
		frame.pack();
		frame.setVisible(true);

	}

}
