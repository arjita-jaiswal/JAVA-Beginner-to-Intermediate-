import java.util.*;
class q1{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.print("Enter Roll No. : ");
int r=sc.nextInt();
sc.nextLine();// to avoid input buffer
System.out.print("Enter name : ");
String n=sc.nextLine();
System.out.print("Enter department : ");
String d=sc.next();
StudentRecord s1=new StudentRecord();
StudentRecord s2=new StudentRecord(r);
StudentRecord s3=new StudentRecord(r,n);
StudentRecord s4=new StudentRecord(r,n,d);
StudentRecord s5=new StudentRecord(s4);
s1.displayRecord();
s2.displayRecord();
s3.displayRecord();
s4.displayRecord();
s5.displayRecord();


}
}
