package fizzBuzz;

import java.util.Scanner;

public class FizzBuzz {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Printing FizzBuzz program, here every multiple of 3 number will be printed as Fizz and every multiple of 5 as Buzz");
		System.out.println("Whereas every multiple of both 3 & 5 as FizzBuzz");
		System.out.println("Enter number of elements to print");
		Scanner scn=new Scanner(System.in);
		int num=scn.nextInt(),i=1;
		while(i<=num) {
			if((i%3==0) & (i%5==0))
				System.out.print("FizzBuzz ");
			else if(i%3==0)
				System.out.print("Fizz ");
			else if(i%5==0)
				System.out.print("Buzz ");
			else
				System.out.print(i+" ");
			i++;
		}
		
		scn.close();
	}

}
