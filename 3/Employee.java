class Employee extends Person{
	int eId;
	double salary;
	Employee(int eId,int aId,String name,double sal){
		super(name,aId);
		this.eId=eId;
		this.salary=sal;
	}
	void displayEmployee(){
		System.out.println("Name in employee class : "+this.name);
		System.out.println("AdhaarId in employee class : "+this.adhaarId);
		System.out.println("ID in employee class : "+this.eId);
		System.out.println("Salary of employee class : "+this.salary);
	}
}