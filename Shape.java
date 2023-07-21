// OOP6-A
// Shape
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.BasicStroke;

public abstract class Shape implements Drawable, Selectable {
	private boolean selected = false;

	public abstract int getWidth();
	public abstract int getHeight();
	public abstract double getArea();
	public abstract void move(int dx, int dy);

	@Override
	public void draw(Graphics g) {
		System.out.println("Drawing... "+this.toString());
		Graphics2D g2 = (Graphics2D)g;
		float strokeWidth = 1;
		Color col = Color.BLACK;
		g2.setStroke(new BasicStroke(strokeWidth));
		g.setColor(col);
		}
	}