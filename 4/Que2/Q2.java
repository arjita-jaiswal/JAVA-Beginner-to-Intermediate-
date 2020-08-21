import java.util.*;
class Q2{
	public static void main(String args[]){
	Saving s=new Saving(1000);
	System.out.println("Before depositing in savings : "+s.getTotal());
	s.depositMoney(20000);
	System.out.println("After depositing in savings : "+s.getTotal());
	PPF p=new PPF(2000);
	System.out.println("Before depositing in PPF : "+p.getTotal());
	p.depositMoney(10000);
	System.out.println("After depositing in PPF : "+p.getTotal());
	}}