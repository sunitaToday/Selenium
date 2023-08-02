package javaProject3;

public class StringDemoReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// string reverse 
		  
		  String str = "nitin";   //7
		  String strRev ="";
		  //output - emocleW - 
		  
		  char ch[] = str.toCharArray();
		  
		  System.out.println(ch);
		  
		  for(int i=str.length()-1; i>=0;i-- )
		  {
		   strRev = strRev + ch[i];
		  }
		  
		  System.out.println(strRev);
		  if(str.equals(strRev) ) {
			  System.out.println("String is pallindrome.");
		  }
		  else System.out.println("String is not pallindrome.");
		}
		}
