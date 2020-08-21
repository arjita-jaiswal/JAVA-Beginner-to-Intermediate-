class Student extends Person{
	int studentId;
	String dept;
	Student(int sId,int aId,String name,String dept){
		super(name,aId);
		this.studentId=sId;
		this.dept=dept;
	}
	void displayStudent(){
		System.out.println("Name in student class : "+this.name);
		System.out.println("AdhaarId in student class : "+this.adhaarId);
		System.out.println("ID in student class : "+this.studentId);
		System.out.println("Dept in student class : "+this.dept);
	}
}