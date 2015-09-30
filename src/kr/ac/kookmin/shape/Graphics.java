package kr.ac.kookmin.shape;

public class Graphics {
	public void draw(Shape s) {
		//Implement here
		System.out.println(s.toString()+"'s bounds is width : "+s.getBounds().getWidth()
				+", Height : "+s.getBounds().getHeight());
		System.out.println("Center is "+s.getCenter().setX()+", "+s.getCenter().setY());
	}
}