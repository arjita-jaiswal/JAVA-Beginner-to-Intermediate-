public class Saving implements Bank{
	double prin;
	static double ir=3.5;
	Saving(double p){
		this.prin=p;
	}
	public void depositMoney(double m){
		prin=prin+m;
	}
	public double getTotal(){
		return (prin+(ir*prin));
	}
}