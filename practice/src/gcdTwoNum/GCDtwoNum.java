package gcdTwoNum;

import java.util.Scanner;

public class GCDtwoNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter two integers whose GCD is required ");
		Scanner scn=new Scanner(System.in);
		int a=scn.nextInt();
		int b=scn.nextInt();
		
		System.out.println("GCD of the given two numbers is "+gcd(a,b));
		scn.close();
	}
	
	public static int gcd(int a,int b) {
		
		if(a==0||b==0)
			return 0;
		
		if(a==b)
			return a;
		
		if(a>b)
			return gcd(a-b,b);
		
		return gcd(a,b-a);
								
	}

}
