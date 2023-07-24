
// OOP7-A
// MoveButtonListener
import java.awt.event.*;

public class CalcButtonListener implements ActionListener {
	private MyPanel panel;

	CalcButtonListener(MyPanel p) {
		super();
		this.panel = p;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Calc button is clicked.");
		if (this.panel != null) {
			this.panel.calcShapes();
		}
	}
}
