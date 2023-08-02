package javaProject3;

public class PolyMultiplicationExamples {

	// overloading

		 static int mult(int a, int b)
		 {
		  int ans = a*b;
		  return ans;
		  
		 }
	// overloading

		 static double mult(double d1, double d2)
		 {
		  double ans = d1*d2;
		  return ans;
		 }
	// overloading

		 static int mult(int a, int b, int c)
		 {
		  int ans = a*b*c;
		  return ans;
		  
		 }
		//overloading
		 static float mult( float f1, float f2)
		 {
			 float ans = f1*f2;
			 return ans;
		 }
		 
		 
		 
		 
		 public static void main(String[] args) {
		  // TODO Auto-generated method stub

		  System.out.println(mult(10, 20));
		  System.out.println(mult(10.22, 20.13));
		  System.out.println(mult(30, 20));
		  int a = mult(10, 20, 10);
		  System.out.println(a);
		  System.out.println(mult(12.2, 2.4));
			

	}

}
