package kr.ac.kookmin.shape;

public class Ellipse extends Shape{
	//Implement here
private int h, w;
	
	public Ellipse(Point center, int w, int h) {
		super(center);
		this.w = w;
		this.h = h;
		// TODO Auto-generated constructor stub
	}
	
	public Rectangle getBounds(){
		Rectangle r = new Rectangle(center, w*2, h*2);
		return r;
	}
	
	public int getSemiMajorAxis(){
		return w;
	}
	
	public int getSwmiMinorAxis(){
		return h;
	}
	@Override
	public void draw(Graphics g) {
		g.draw(this);
	}
	@Override
	public String toString() {
		return "Ellipse";
	}
}