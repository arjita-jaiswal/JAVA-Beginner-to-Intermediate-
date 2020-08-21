public class Rectangle extends Shape{
	int length;
	int breadth;
	Rectangle(int l,int b){
		this.length=l;
		this.breadth=b;
	}
	double getArea(){
		double a=((this.length)*(this.breadth));
		return a;
	}
	double getPerimeter(){
		double p=(2*((this.length)+(this.breadth)));
		return p;
	}
}