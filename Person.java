package lab8;

public class Person {
	String fname;
	String lname;
	String DoB;
	int age; 	//derived attribute of DoB
	String address;
	String contactNumber;
	
	Person()
	{
	/* we have to make empty constructor whenever we have to inhertit it 
		any class
		*/
	}
/* 1st const*/	Person(String fname,String lname)
	{
		this.fname=fname;
		this.lname=lname;
		//System.out.println("First name:"+fname+"Last name:"+lname);
		
		}
/* 2nd const*/	Person(String fname,String lname,String contactNumber)
	{
		this(fname,lname);
		this.contactNumber=contactNumber;
		//System.out.println("First name:"+fname+"Last name:"+lname+"contact: "+contactNumber);
		
		}
/* 3rd const*/	Person(String fname,String lname,
		String contactNumber,String DoB,int age,String address)
	{
/*	this.fname=fname;					{ Instead of writing this we can simply   
	this.lname=lname;        			 ^ call above constructor }
	this.contactNumber=contactNumber;    |    
	  */
		
		this(fname,lname,contactNumber);
		this.address=address;
		this.age=age;
		this.DoB=DoB;
		
		
		}
	void display() {
		System.out.println("1. First name: "+fname+"\n2. Last name: "+lname+"\n3. contact: "+contactNumber
				+"\n4. Address: "+address+"\n5. age: "+age+"\n6. Date of Birth: "+DoB);
	}
}
