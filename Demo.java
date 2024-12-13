package lab8;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Person p1 = new Person("muhammad","Arman","0313-2313318","22/july/2004",20,"Shadman Town 14-b");
		Person p1 = new Person("muhammad","Arman","0313-2313318");//,"22/july/2004",20,"Shadman Town 14-b");
		p1.display();
		Student s1 = new Student("muhammad","Arman","0313-2313318","22/july/2004",20,"Shadman Town 14-b",
				20732,"Bachelors","BS-CS",3.82);
		System.out.println("==========================================");
	s1.displayStudent();
	}
	

}
