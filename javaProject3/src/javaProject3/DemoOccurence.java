package javaProject3;

public class DemoOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// count occurrence of char 'a' in given string:

		
				String s = "Java Program";
				System.out.println(s.length());
				int count =0;
				for (int i=0; i<s.length(); i++) {
					if (s.charAt(i)=='a') 
					{
						count++;
					}
					}
					System.out.println("Count of char 'a' =" +count);
					// there is mistake, check it
				
	}

	}
