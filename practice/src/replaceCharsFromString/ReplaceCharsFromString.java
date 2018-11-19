package replaceCharsFromString;

import java.util.Scanner;

public class ReplaceCharsFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter a String");
		Scanner scn=new Scanner(System.in);
		
		String inStr=scn.nextLine();
		
		System.out.println("Enter the character to replace from the string entered");
		
		char ch1=scn.next().charAt(0);	
		
		System.out.println("Enter the character to replace with the string entered");
		char ch2=scn.next().charAt(0);
		
		System.out.println("String after replacing the character "+replaceChrFrmStr(inStr,ch1,ch2));
		scn.close();
		
	}
	
	public static String replaceChrFrmStr(String str, char ch1,char ch2) {
		
		str=str.replace(ch1, ch2);
		return str;
	}

	
}
