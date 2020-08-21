import java.util.*;
class Student{
	String name;
	String dep;
	int roll;
	int marks;
	Student(String n,String d,int r,int m){
		this.name=n;
		this.dep=d;
		this.roll=r;
		this.marks=m;
	}
	public static void main(String[] args){
		ArrayList<Student>a=new ArrayList<Student>();
		a.add(new Student("Amar","CSE",111,90));
		a.add(new Student("Ajit","ECE",222,67));
		a.add(new Student("Bipul","HS",1111,30));
		a.add(new Student("Bidyut","CSE",23,34));
		a.add(new Student("Pradyut","ECE",567,78));System.out.println("Student having marks greater than 50:  ");
		Iterator<Student> iter = a.iterator();
			Student s=null;
			while (iter.hasNext()){
				s=iter.next();
				if(s.marks>50){
					System.out.println(s.name+" "+s.dep+" "+s.roll+" "+s.marks);
				}
			}System.out.println("                                           ");System.out.println("Students in CSE: ");
		Iterator<Student> iter1 = a.iterator();
			Student s1=null;
			while (iter1.hasNext()){
				s1=iter1.next();
				if(s1.dep.equals("CSE")){
					System.out.println(s1.name);
				}
			}System.out.println("                                           ");System.out.println("Average Marks: ");
		Iterator<Student> iter2 = a.iterator();
			Student s2=null;
			while (iter2.hasNext()){
				s2=iter2.next();
				int k=s2.marks;
				int p=k/5;
				System.out.println(s2.name+" "+p);
			}
	}
}
