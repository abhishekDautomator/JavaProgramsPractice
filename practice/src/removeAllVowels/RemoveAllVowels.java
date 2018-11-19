package removeAllVowels;

import java.util.Scanner;

public class RemoveAllVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter a String");
		Scanner scn=new Scanner(System.in);
		
		String str=scn.nextLine();
		
		
		
		str=str.replaceAll("[aeiouAEIOU]","");
		
		System.out.println("String after removal of vowels is "+str);
		scn.close();
		String newStr="";
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			if(!isVowel(c))
				newStr+=c;
		}
		
		System.out.println("String after removal of vowels using manual method is "+newStr);
	}
	
		public static boolean isVowel(char c) {
			switch(c) {
			case 'A': case 'E': case 'I': case 'O': case 'U':
			case 'a': case 'e': case 'i': case 'o': case 'u':
				return true;
			default:
				return false;
			}
	}

}
