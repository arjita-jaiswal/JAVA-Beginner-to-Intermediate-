import java.util.*;
class Q1{
	public static void main(String args[]){
		Circle c=new Circle(4);
		System.out.println("Name and no of sides: "+c.toString("Circle",0));
		System.out.println("Area of circle: "+c.getArea());
		System.out.println("Perimeter of circle : "+c.getPerimeter());
		Rectangle r=new Rectangle(2,4);
		System.out.println("Name and no of sides: "+r.toString("Rectangle",4));
		System.out.println("Area of rectangle: "+r.getArea());
		System.out.println("Perimeter of rectangle : "+r.getPerimeter());
		
	}
}