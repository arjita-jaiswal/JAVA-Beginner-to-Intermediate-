class Faculty extends Employee{
	String teachingDept;
	Faculty(int eId, int aId, String name, double sal, String tDept){
		super(eId,aId,name,sal);
		this.teachingDept=tDept;
	}
	void displayFaculty(){
		System.out.println("Name in Faculty class : "+this.name);
		System.out.println("Dept in Faculty class : "+this.teachingDept);
		System.out.println("ID in Faculty class : "+this.eId);
		System.out.println("Salary of Faculty class : "+this.salary);
	}
}