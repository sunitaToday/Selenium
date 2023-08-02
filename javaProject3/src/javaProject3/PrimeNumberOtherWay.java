package javaProject3;

public class PrimeNumberOtherWay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		  int num=23;
		  boolean flag = true;
		  
		  for(int i=2; i<num/2;i++)
		  {
		   if(num%i==0) // 2, 3, 4, 5, .... if(25%5 ==0)  //
		   {
		    flag = false;
		    
		    break;
		   }
		   
		  }
		  if(flag == true)
		  {
		   System.out.println("Prime Number "); 
		  }
		  else
		  {
		   System.out.println("Number is not Prime");
		  }
	}

}
