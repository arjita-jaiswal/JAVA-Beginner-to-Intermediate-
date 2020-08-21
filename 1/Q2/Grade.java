import java.util.*;
public class Grade{

	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		Student S1=new Student();
		Student S2=new Student();
		
		//for first student
		System.out.print("Enter name: ");
		String n1=sc.nextLine();
		S1.setname(n1);
		System.out.print("Enter mark1: ");
		int a1=sc.nextInt();
		S1.setmark1(a1);
		System.out.print("Enter mark2: ");
		int a2=sc.nextInt();
		sc.nextLine();//to avoid input buffer
		S1.setmark2(a2);
		S1.calculate(a1,a2);
		S1.displayRecord();

		//for second student
		System.out.print("Enter name: ");
		
		String n2=sc.nextLine();
		S2.setname(n2);
		System.out.print("Enter mark1: ");
		int b1=sc.nextInt();
		S2.setmark1(b1);
		System.out.print("Enter mark2: ");
		int b2=sc.nextInt();
		S2.setmark2(b2);
		S2.calculate(b1,b2);
		S2.displayRecord();
				}
		}
