public class Circle extends Shape{
	int  radius;
	Circle(int  r){
		this.radius=r;
	}
	double getArea(){
		double a;
		a=3.14*radius*radius;
		return a;
	}
	double getPerimeter(){
		double p;
		p=2*3.14*radius;
		return p;
		}
}