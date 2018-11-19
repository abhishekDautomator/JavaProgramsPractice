package fibbonacciSeries;

import java.util.Scanner;

public class FibbonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number of elements required in fibonacci series");
		Scanner scn=new Scanner(System.in);
		
		int num=scn.nextInt();
		
		System.out.println("Your Fibonacci series is : "+fibbonacci(num));
		scn.close();
	}
	
	public static String fibbonacci(int num) {
		long a=0,b=1,sum;String s="0 1 ";
		while(num>2) {
			sum=a+b;
			s+=Long.toString(sum)+" ";
			a=b;
			b=sum;
			num--;
		}
		
		return s;
	}

}
