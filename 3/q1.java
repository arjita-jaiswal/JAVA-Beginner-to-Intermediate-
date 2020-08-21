import java.util.*;
class q1{
public static void main(String args[]){
	Person p=new Person("Jahnavi Jaiswal",1409);
	Student s=new Student(1701012,1409,"Arjita Jaiswal","CSE");
	Employee e=new Employee(2,55,"Rehena",2500);
	Faculty f=new Faculty(4,26,"Sanjay Maulik",50000,"CSE");
	p.displayPerson();
	s.displayStudent();
	e.displayEmployee();
	f.displayFaculty();
}}