import java.util.*;
import java.io.*;
class Person{
	String name;
	int id;
	int salary;
	Person(String name,int id,int salary){
		this.name=name;
		this.id=id;
		this.salary=salary;
	}
}
class Q1{
	public static void main(String args[]) throws IOException{
		File f=new File("input1.txt");
		Scanner sc=new Scanner(f);
		Person[] arr=new Person[6];
		Person[] temp=new Person[6];
		int i=0;
		while(sc.hasNextLine()){
				String name=sc.next();
				int id=sc.nextInt();
				int salary=sc.nextInt();
				arr[i] = new Person(name,id,salary);
				i++;
		}
		Person t = null;
		for (int ii= 0; ii < 6; ii++){
            			for (int j = 0; j < 5-ii; j++){
               				 if (arr[j].salary > arr[j+1].salary){
					t = arr[j];
					arr[j] = arr[j+1];
					arr[j+1]=t;
				}
			}
		}
		sc.close();

		File fileWrite=new File("output1.txt");
		fileWrite.createNewFile();
		FileWriter wr=new FileWriter(fileWrite);
		int k=0;
		while(k<6){
			wr.write(arr[k].name+" "+arr[k].id+" "+arr[k].salary+"\n");
			wr.flush();
			k++;
		}
		wr.flush();
		wr.close();
	}
}