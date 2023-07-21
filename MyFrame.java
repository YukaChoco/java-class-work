// OOP6/7-A/B
// Frame
import java.awt.*;
import javax.swing.*;

public class MyFrame extends JFrame {
	private MyPanel panel = null;

	public MyFrame(String title,int x, int y, int w, int h) {
		super(title);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setLocation(x, y);
		this.setSize(w, h);
		this.panel = new MyPanel();
		this.add(this.panel, BorderLayout.CENTER);
		this.setVisible(false);
		}
	
	public void addShape(Shape s) {
		if (this.panel != null)  {
			this.panel.addShape(s);
			}
		}
	
	public void makeVisible() {
		this.setVisible(true);
	}

	// (class method)
	// set UI as cross-platform Look and Feel (Metal) 
	public static void setUI() {
		try {
			UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
			} 
		catch (Exception e) {
			e.printStackTrace();
			}
		}
	}
