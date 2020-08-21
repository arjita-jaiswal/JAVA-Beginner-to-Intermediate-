public class PPF implements Bank{
	double pri;
	static double ir=7.5;
	PPF(double p){
		this.pri=p;
	}
	public void depositMoney(double d){
		pri=pri+d;
	}
	public double getTotal(){
		return (pri+(ir*pri));
	}
}