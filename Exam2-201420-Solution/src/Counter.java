import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Counter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		JFrame frame = new JFrame("Counter");
		final JLabel field = new JLabel();
		field.setText("Current counter value: 0");
		JPanel panel = new JPanel();
		JButton add = new JButton("Add one to the counter");
		add.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String text = field.getText();
				String shortText = text.substring(23);
				int newCounter = Integer.parseInt(shortText) + 1;
				field.setText("Current counter value: " + newCounter);
				
			}
		});
		JButton reset = new JButton("Reset to 0");
		reset.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				field.setText("Current counter value: 0");
				
			}
		});
		panel.add(add);
		panel.add(reset);
		frame.add(panel,BorderLayout.SOUTH);
		frame.add(field);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
