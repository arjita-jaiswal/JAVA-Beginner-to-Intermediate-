class StudentRecord{
int rollNo;
String name;
String dep;
StudentRecord(){
this.rollNo=-1;
this.name="000";
this.dep="000";
}
StudentRecord(int rollNo){
this.rollNo=rollNo;
this.name="000";
this.dep="000";
}
StudentRecord(int rollNo,String name){
this.rollNo=rollNo;
this.name=name;
this.dep="000";
}
StudentRecord(int rollNo,String name,String dep){
this.rollNo=rollNo;
this.name=name;
this.dep=dep;
}
StudentRecord(StudentRecord s1){
this.rollNo=s1.rollNo;
this.name=s1.name;
this.dep=s1.dep;
}
void displayRecord(){
System.out.println(name+" "+rollNo+" "+dep);
}
}

