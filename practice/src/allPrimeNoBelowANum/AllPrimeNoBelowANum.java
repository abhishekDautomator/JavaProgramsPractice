package allPrimeNoBelowANum;

import java.util.Scanner;

public class AllPrimeNoBelowANum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter a number");
		Scanner scn=new Scanner(System.in);
		
		int num=scn.nextInt();
		if(num<=2)
			System.out.println("No Prime number exists below 2");
		else if(num==3)
			System.out.println("All Prime number below "+num+" are "+1+" ,"+2);
		else
		{
		System.out.println("All Prime numbers below "+num+" are");
		System.out.print(1);
		int all=2;
		while(all<num) {
		int counter=0;
		
		for(int i=2;i<=all/2;i++) {
			if(all%i==0)
				counter++;
		}
		
		if(counter==0) {
			
			System.out.print(", "+all);
		}
		all++;
		}
		}
		scn.close();
		
	}

}
