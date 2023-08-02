package javaProject3;

public class numberOfWordsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// logic: to count spaces between words NOT ABLE TO UNDERSTAND
		//String="Welcome to javaProgram."
		
		String s = "Welcome to javaProgram class.";
		int length = s.length();
		int count = 0;
		for (int i =0; i<s.length()-1; i++) {
		
		
		if (s.charAt(i)== ' ' && (s.charAt(i)!= ' ')){
			count++;
		}
		
		}
		System.out.println(count);
		
	}
	}
