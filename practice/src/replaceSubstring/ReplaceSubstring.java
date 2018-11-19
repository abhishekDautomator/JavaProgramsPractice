package replaceSubstring;

import java.util.Scanner;

public class ReplaceSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter a String");
		Scanner scn=new Scanner(System.in);
		
		String str=scn.nextLine();
		
		System.out.println("Enter a substring need to replace in the string");
		String substr1=scn.nextLine();
		
		System.out.println("Enter a substring need to replace with the string");
		String substr2=scn.nextLine();
		
		str=str.replaceAll(substr1, substr2);
		
		System.out.println("String after replacement of substring is "+str);
		scn.close();
	}

}
