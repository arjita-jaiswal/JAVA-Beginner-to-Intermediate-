class Person{
	String name;
	int adhaarId;
	Person(String s,int a){
		this.name=s;
		this.adhaarId=a;
	}
	void displayPerson(){
		System.out.println("Name in person class : "+this.name);
		System.out.println("AdhaarId in person class : "+this.adhaarId);
	}
}