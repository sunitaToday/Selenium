package javaProject3;

public class DemoPolymorphism {
	// add 2 numbers
	
		 static int sum(int a, int b)
		 {
		   int sum= a+b; // write static to remove error, now u will get console
		  System.out.println("Sum of a = "+a+" and b = "+b+ " sum = "+sum);
		  return sum;
		 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sum(10, 20); // 30
		// we must assign this sum to some variable/or print in order to store
		int a = sum(10, 20); // or by printing
		System.out.println(sum(10,20));
	}

}
