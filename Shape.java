
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
		System.out.println("Drawing... " + this.toString() + " selected = " + this.selected);
		Graphics2D g2 = (Graphics2D) g;
		float strokeWidth = (this.selected ? 2 : 1);
		Color col = (this.selected ? Color.RED : Color.BLACK);
		g2.setStroke(new BasicStroke(strokeWidth));
		g.setColor(col);
	}

	public abstract boolean contains(int x, int y);

	public void selectByClick(int x, int y) {
		this.selected = contains(x, y);
	}

	public boolean moveSelected(int dx, int dy) {
		if (this.selected) {
			this.move(dx, dy);
			return true;
		}
		return false;
	}

	public double calcSelectedShapeArea() {
		if (this.selected) {
			return this.getArea();
		}
		return 0;
	}
}
