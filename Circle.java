// OOP6-A
// Circle
import java.awt.*;

public class Circle extends Shape {
	private int x, y, r;

	public Circle(int cx,int cy,int cr) {
		this.x=cx; this.y = cy; this.r = cr;
		}

	@Override
	public int getWidth() {
		return (this.r*2);
		}

	@Override
	public int getHeight() {
		return (this.r*2);
		}

	@Override
	public double getArea() {
		return ((double)(this.r * this.r * Math.PI));
		}

	@Override	
	public void move(int dx,int dy) {
		this.x += dx; this.y += dy;
		}
		
	@Override
	public void draw(Graphics g) {
		super.draw(g);
		g.drawOval(this.x - this.r, this.y - this.r, 
			this.getWidth(), this.getHeight());
		}

	@Override
	public String toString() {
		return ("C (" + this.x + ", " + this.y + ") r=" + this.r);
		}
	}
