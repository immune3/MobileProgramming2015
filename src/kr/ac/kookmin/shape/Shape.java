package kr.ac.kookmin.shape;

public abstract class Shape {
	
	protected Point center;
		
	public Shape(Point center){
		this.center = center;
	}
	
	public Point getCenter(){
		return center;
	}
	
	public abstract Rectangle getBounds();

	public abstract void draw(Graphics g);
//Implement here
}