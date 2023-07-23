
// OOP6-A
// MyPanel
import java.awt.*;
import javax.swing.*;
import java.util.List;
import java.util.ArrayList;
import java.awt.event.*;

public class MyPanel extends JPanel {
	private List<Shape> shapeList;

	public MyPanel() {
		super();
		this.shapeList = new ArrayList<>();

		MouseAdapter myml = new MyMouseListener(this);
		this.addMouseListener(myml);

		JButton movebt = new JButton("move");
		this.add(movebt);

		ActionListener movebtAl = new MoveButtonListener(this);
		movebt.addActionListener(movebtAl);
	}

	public void addShape(Shape s) {
		this.shapeList.add(s);
		this.repaint();
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		System.out.println("MyPanel painting ...");
		for (Shape se : this.shapeList) {
			if (se != null)
				se.draw(g);
		}
	}

	public void panelClicked(int x, int y) {
		for (Shape se : this.shapeList) {
			if (se != null)
				se.selectByClick(x, y);
		}
		this.repaint();
	}

	public void moveShapes(int dx, int dy) {
		for (Shape se : this.shapeList) {
			if (se != null)
				se.moveSelected(10, 20);
		}
		this.repaint();
	}
}
