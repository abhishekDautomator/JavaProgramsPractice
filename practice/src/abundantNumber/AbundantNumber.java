package abundantNumber;

import java.util.Scanner;

public class AbundantNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter an integer");
		Scanner scn=new Scanner(System.in);
		int num=scn.nextInt();
		int count=1,sum=0;
		while(count<=(num/2)) {
			if(num%count==0)
				sum+=count;
			count++;
		}
		if(sum>num) 
			System.out.println("Entered no. is an abundant number");
		else
			System.out.println("Entered no. is not an abundant number");
		
		scn.close();
	}

}
