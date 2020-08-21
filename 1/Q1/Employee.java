import java.util.*;
public class Employee{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String Name=sc.nextLine();
int Id=sc.nextInt();
double Salary=sc.nextDouble();
char Grade=' ';
if (80000<=Salary){
Grade='A';
}
else if(50000<=Salary && 79999>=Salary){
Grade='B';
}
else if(30000<=Salary && 49999>=Salary){
Grade='C';
}
else if(29999>=Salary){
Grade='D';
}
System.out.println("Employee Name: "+Name);
System.out.println("Employee ID: "+Id);
System.out.println("Employee Salary: "+Salary);
System.out.println("Employee Grade: "+ Grade);
}}