package javaProject3;

public class VowelConsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// count vowels in a string.
		
		  String s = "Java Program";
		    
		  int count =0;
		  
		  for(int i=0;i<s.length(); i++)
		  {
		  char ch = s.charAt(i);
		  if(ch=='a'|| ch=='e'|| ch=='i'||ch=='o'|| ch=='u')
		  {
		  count++;
		  } 
		  }
		  System.out.println("Count of char 'a' = "+count);
	}
	}
