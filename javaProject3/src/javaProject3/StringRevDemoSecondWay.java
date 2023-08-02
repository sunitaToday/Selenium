package javaProject3;

public class StringRevDemoSecondWay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Welcome";
		String strRev ="";
		 for(int i=str.length()-1; i>=0; i--)
		 {
			 strRev= strRev + str.charAt(i);
		 }
System.out.println(strRev);
if(str.equalsIgnoreCase(strRev))
{
 System.out.println(" String is palindrome");
}
else
{
 System.out.println(" String is not palindrome");
	}
	}
}
