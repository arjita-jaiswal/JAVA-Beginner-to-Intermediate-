import java.util.*;
class q2{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.print("Enter operand1: ");
int a=sc.nextInt();
System.out.print("Enter operator: ");
String s=sc.next();
System.out.print("Enter operand2: ");
int b=sc.nextInt();
Operation op= new Operation(a,s,b);
op.calculateValue();
op.displayResult();
}
}