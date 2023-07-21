// OOP6/7-A/B
// Main
public class Main  {
	public static void main(String[] args){
		MyFrame.setUI(); // set cross-platform UI

		MyFrame mf1 = new MyFrame("frame 1",50,50,300,300);
		Shape s = new Rect(50,50,150,100);
		mf1.addShape(s);
		mf1.addShape(new Rect(100,75,180,155)); 
		mf1.addShape(new Circle(120,170,50));
		mf1.addShape(new Circle(210,70,20));
		mf1.makeVisible();

		MyFrame mf2 = new MyFrame("frame 2",400,100,300,270);
		mf2.addShape(new Rect(70,50,130,140));
		mf2.addShape(new Circle(170,90,50));
		mf2.addShape(new Circle(100,110,70)); 
		mf2.makeVisible();
		}
	}
