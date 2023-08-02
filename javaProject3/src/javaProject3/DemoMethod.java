package javaProject3;

public class DemoMethod {
	 // add 2 numbers
	 static void sum(int a, int b)
	 {
	  int sum= a+b;
	  System.out.println("Sum of a = "+a+" and b = "+b+ " sum = "+sum);
	  
	 }
	 static void mult (int a, int b) {
		 int mult = a*b;
		 System.out.println("By multipiying a and b, we will get: " +mult);
	 }
	public static void main(String[] args) {
		sum(10, 20); // 30
		sum(20, 30); // 50
		sum(35, 10); // 45
		sum(45,2); //47
		mult(2,77);
	}
	
		
		
	
	 
	
	}
	


