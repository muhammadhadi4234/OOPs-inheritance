package lab8;

public class Student extends Person {
	
	int studentId;
	String program;
	String department;
	double CGPA;
	
	Student(String fname,String lname,
			String contactNumber,String DoB,int age,String address,int studentId, String program, 
			String department, double CGPA)
	
	{
		super.fname=fname;
		super.lname=lname;
		super.contactNumber=contactNumber;
		super.DoB=DoB;
		super.age=age;
		super.address=address;
		this.studentId=studentId;
		this.program=program;
		this.CGPA=CGPA;
		this.department=department;	
	}
	
	void displayStudent() 
	{
		display();
		System.out.println("\n7. Student ID: "+studentId+"\n8. Degree Program is: "+program
				+"\n9. CGPA is: "+CGPA+"\n10. Department is: "+department);
	}
}
