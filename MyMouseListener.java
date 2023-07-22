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
		int x = e.getX();
		int y = e.getY();
		System.out.println("Clicked at ("+x+","+y+")");
		this.panel.panelClicked(x, y);
		}
	}
