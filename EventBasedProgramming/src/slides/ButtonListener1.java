package slides;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class ButtonListener1 implements ActionListener {

	private JButton eatButton;

	public ButtonListener1(JButton eatButton) {
		this.eatButton = eatButton;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		System.out.println("button pressed");
		this.eatButton.setText("button pressed");
	}

}
