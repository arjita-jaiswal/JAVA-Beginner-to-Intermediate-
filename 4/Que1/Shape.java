public abstract class Shape{
	String name;
	int noSides;
	abstract double getArea();
	abstract double getPerimeter();
	public String toString(String n,int no){
		this.name=n;
		this.noSides=no;
		return (name+" and "+noSides);
	}
}