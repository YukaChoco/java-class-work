// OOP6-A
// MyMouseListener
import java.awt.event.*;

public class MyMouseListener extends MouseAdapter {
	private MyPanel panel;
	
	MyMouseListener(MyPanel panel) {
		super();
		this.panel = panel;
		}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		int x = 0; // Step1. to be changed
		int y = 0; // Step1. to be changed
		System.out.println("Clicked at ("+x+","+y+")");
		// Step2. insert here
		}
	}
