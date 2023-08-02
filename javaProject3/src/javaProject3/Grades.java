package javaProject3;

public class Grades {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int marks =40;
		if(marks>=92) {
			System.out.println("Grade A+");
		}
		else if(marks>=80) {
			System.out.println("Grade A");
		}else if(marks>=60) {
			System.out.println("Grade B");
		}else if(marks>=50) {
			System.out.println("Grade C");
		}else {
			System.out.println("Fail");
		}

}
}