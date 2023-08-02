package javaProject3;

public class Student {
	int age;
	String name;
	Student(){
		age = 0;
		name = "test";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Student s1 = new Student ();
		s1.age = 10;
		s1.name = "Rani";
		System.out.println(s1.age);
		System.out.println(s1.name);
		
		Student s2 = new Student ();
		s2.age = 40;
		s2.name = "Vani";
		System.out.println(s2.age);
		System.out.println(s2.name);
		*/

		Student2 s1 = new Student2();
		  s1.age=20;
		  s1.name="Rani";
		  s1.printDetails();
		  
		Student2 s2 = new Student2();
		  s2.age=15;
		  s2.name="Sujana";
		  s2.printDetails();
	}

}
