import java.io.*;
import java.util.*;
class Person {
	int id;
	String Name;
	double Salary;
	
	public String toString(){
        return Name+" "+id+" "+Salary+"\n";
    }
}

public class Q2{
    public static void main(String args[]) throws Exception{
	Person[] Array=new Person[10];
	File f=new File("input2.txt");
	Scanner sc=new Scanner(f);
	int i=0;
	while(sc.hasNextLine()) {
		Array[i]=new Person();
		Array[i].Name=sc.next();
		Array[i].id=sc.nextInt();
		Array[i].Salary=sc.nextDouble();
		i++;
	}
	int n=i;
	int max=0,ma=0;
	double maxsalary=0,minsalary=0;
	int min=1000000,mi=0;
	for(i=0;i<n;i++) {
		int count=0;
		double sal=Array[i].Salary;
		for(int j=i+1;j<n;j++) {
			if((Array[i].Name).equals((Array[j].Name))) {
				count++;
				sal=sal+Array[j].Salary;
			}
		}
		if(count>max) {
			maxsalary=sal;
			max=count;
			ma=i;
		}
		if(count<min) {
			minsalary=sal;
			min=count;
			mi=i;
		}
		
	}
			
	File file=new File("output2.txt");
	file.createNewFile();
	FileWriter wr=new FileWriter(file,false);
		wr.write(Array[ma].Name+" "+maxsalary+" \n");
		wr.flush();
		wr.write(Array[mi].Name+" "+minsalary+" \n");
		wr.flush();
	}
}


