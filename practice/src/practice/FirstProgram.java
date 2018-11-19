package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Scanner;

public class FirstProgram {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader s = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the total numbers to add");
        int total=s.read();
        s.readLine();
        System.out.println("Enter the string of numbers");
        String numString=s.readLine();
   
        String[] arr=new String[total];
        //if(numString!="") {
        arr=numString.split(" ");
        //}
        /*else {
        	System.out.println("Null string");
        }*/
        int[] intArr=new int[arr.length];
        int sum=0;
        for(int i=0;i<arr.length;i++) {
        	intArr[i]=Integer.parseInt(arr[i]);
        	sum+=intArr[i];
        }
        
        
        System.out.println("Total number of integers in string "+numString+" are "+arr.length);
        System.out.println("Sum of numbers in the string is "+sum);
        s.close();

	}

}
