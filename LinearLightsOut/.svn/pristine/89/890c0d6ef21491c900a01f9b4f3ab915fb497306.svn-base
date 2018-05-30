package linearLightsOut;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;

public class NewGameActionListener implements ActionListener {
	private ArrayList<JButton> buttons;

	public NewGameActionListener(ArrayList<JButton> buttons) {
		this.buttons = buttons;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		for (int i = 0; i < this.buttons.size(); i++) {
			double a = Math.random();
			if (a < 0.5) {
				this.buttons.get(i).setText("O");
			} else {
				this.buttons.get(i).setText("X");
			}
		}
	}
}
