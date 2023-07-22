
// OOP6-A
// Rect
import java.awt.*;

public class Rect extends Shape {
	private int x1, y1, x2, y2;

	public Rect(int x1, int y1, int x2, int y2) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}

	@Override
	public int getWidth() {
		return (this.x2 - this.x1);
	}

	@Override
	public int getHeight() {
		return (this.y2 - this.y1);
	}

	@Override
	public double getArea() {
		return ((double) (this.getWidth() * this.getHeight()));
	}

	@Override
	public void move(int dx, int dy) {
		this.x1 += dx;
		this.x2 += dx;
		this.y1 += dy;
		this.y2 += dy;
	}

	@Override
	public void draw(Graphics g) {
		super.draw(g);
		g.drawRect(this.x1, this.y1, this.getWidth(), this.getHeight());
	}

	@Override
	public String toString() {
		return ("R (" + this.x1 + ", " + this.y1 + ")-(" + this.x2 + ", " + this.y2 + ")");
	}

	public boolean contains(int x, int y) {
		if (this.x1 <= x && x <= this.x2) {
			if (this.y1 <= y && y <= this.y2) {
				return true;
			}
		}
		return false;
	}
}
