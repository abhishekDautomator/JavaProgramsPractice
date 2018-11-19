package secondLargestNumber;

import java.util.Arrays;
import java.util.Scanner;
//import java.util.Collections;

public class SecondLargestNumberMethod1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Array through initialization
		int[] array= {2,8,4,5,6};
		Arrays.sort(array);
		System.out.println("Largest number in the 1st array is "+array[array.length-1]);
		System.out.println("Second Largest number in the 1st array is "+array[array.length-2]);
		
		
		//Array through user input
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the length of the Array");
		int len=scn.nextInt();
		int[] array2=new int[len];
		for(int i=0;i<array2.length;i++) {
			array2[i]=scn.nextInt();
		}
		
		Arrays.sort(array2);
		System.out.println("Largest number in the 1st array is "+array2[array2.length-1]);
		System.out.println("Second Largest number in the 1st array is "+array2[array2.length-2]);
		scn.close();
	}

}
