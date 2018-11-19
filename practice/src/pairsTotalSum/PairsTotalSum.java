package pairsTotalSum;

import java.util.Arrays;
import java.util.Scanner;

public class PairsTotalSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int l,r,size,NumArray[],sum;
		
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		size=scn.nextInt();
		NumArray=new int[size];
		System.out.println("Enter the num Array");
		for(int i=0;i<size;i++) {
			NumArray[i]=scn.nextInt();
		}
		
		System.out.println("Entered num array is: "+Arrays.toString(NumArray));
		System.out.println("Enter the sum required");
		sum=scn.nextInt();
		l=0;r=size-1;
		Arrays.sort(NumArray);
		System.out.println("All such pairs which will produce a sum of "+sum+" are:");
		while(l<r) {
			if((NumArray[l]+NumArray[r])==sum) {
				System.out.print("("+NumArray[l]+","+NumArray[r]+")");
				l++;
			}
			else if((NumArray[l]+NumArray[r])<sum){
				l++;
			}
			else
				r--;
		}
		scn.close();
	}

}
