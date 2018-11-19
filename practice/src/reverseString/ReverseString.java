package reverseString;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the string");
		
		Scanner scn=new Scanner(System.in);
		String s=scn.nextLine();
		
		
		
		System.out.println("Actual String is "+s);
		//using substring
		System.out.print("Reverse of the String using substring concept is ");
		for(int i=s.length();i>0;i--) {
			System.out.print(s.substring(i-1,i));
		}
		System.out.println();
		
		//using in-built method
		String reverse=new StringBuffer(s).reverse().toString();
		System.out.println("Reverse of the String using StringBuffer class reverse() method is "+reverse);
		scn.close();
		
		StringBuilder sb=new StringBuilder(s);
		String Rev=sb.reverse().toString();
		System.out.println("reverse of  String using String builder is :"+Rev);
		
		//using character array
		char[] strArr=s.toCharArray();
		System.out.print("Reverse of the String using Array concept is ");
		for(int i=s.length()-1;i>=0;i--) {
			System.out.print(strArr[i]);
		}
		System.out.println();
		
		//using ArrayList object and Collections class
		List<String> arrList=new ArrayList<String>();
		char[] chrArray=s.toCharArray();
		for(int i=0;i<chrArray.length;i++) {
			arrList.add(Character.toString(chrArray[i]));
		}
		Collections.reverse(arrList);
		String rev="";
		for(int i=0;i<arrList.size();i++) {
		rev+=arrList.get(i).toString();
		}
		System.out.print("Reverse of the String using ArrayList object and Collections class is "+rev);
	}

}
