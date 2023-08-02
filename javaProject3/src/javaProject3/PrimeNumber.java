package javaProject3;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// what is prime number? - Numbers divisible by 1 or itself e.g - 5, 7, 11, 13, 17 
				int num=25; 
				boolean flag = true; 
				for(int i=2; i<num;i++) 
				{ 
				if(num%i==0) 
				{ 
				flag = false; 
				System.out.println("Not Prime"); 
				break; 
				} 

				} 
				if(flag == true) 
				{ 
				System.out.println("Prime Number "); 
				} 


	}

}
