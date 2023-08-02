package javaProject3;

public class Teacher {
	String name; //instance var
	String subject; // instance var
	
	Teacher()
	{
		String name = "test1" ;
		String subject = "test2";
	}
	
	Teacher (String name1, String Subject1)
	{
		name = name1;
		subject = Subject1;
	}
	
	// do it from here
	public static void main(String[] args) {
		// TODO Auto-generated method stub

			  
				Teacher t1 = new Teacher();  // t 1
				t1.name = "Vasudha";
				t1.subject = "Maths";
				System.out.println(t1.subject);
				System.out.println(t1.name);
			
				
				Teacher t2 = new Teacher();  // t 1
				t2.name = "Ravi";
				t2.subject = "Physics";
				System.out.println(t2.subject);
				System.out.println(t2.name);
								
	}
			
	}


