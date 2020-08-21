class Student{
private String name;
private int mark1;
private int mark2;
private double per;
private char grade=' ';
void setname(String Name){
name=Name;
}
void setmark1(int m1){
mark1=m1;
}
void setmark2(int m2){
mark2=m2;
}

void calculate(int m1,int m2){
per=(mark1+mark2)/2;
if(per>=40){
grade='P';
}
else if(per<40){
grade='F';
}
}
void displayRecord(){
System.out.println("Student Name: "+name+System.lineSeparator()+"Student's Percentage: "+per+System.lineSeparator()+"Student's Grade: "+grade);
}}
