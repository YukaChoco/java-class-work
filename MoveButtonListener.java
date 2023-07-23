// OOP7-A
// MoveButtonListener
import java.awt.event.*;

public class MoveButtonListener implements ActionListener {
	private MyPanel panel;
	
	MoveButtonListener(MyPanel p) {
		super();
		this.panel = p;
		}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Move button is clicked.");
		if (this.panel != null) {
			// insert here
			}
		}
	}
