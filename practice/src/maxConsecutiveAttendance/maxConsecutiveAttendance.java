package maxConsecutiveAttendance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class maxConsecutiveAttendance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the number of Employees");
		int numEmployees=Integer.parseInt(scn.nextLine());
		
		ArrayList<String> al=new ArrayList<String>();
		
		System.out.println("Enter the attendance of employees in String format each having length of"+ numEmployees);
		String[] a=scn.nextLine().split(" ");
		for(String s:a) {
			al.add(s);
		}
		
		int count=0;
		ArrayList<Integer> MaxOccur=new ArrayList<Integer>();
		for(int i=0;i<al.size();i++) {
			//char[] arr=al.get(i).toCharArray();
			
			if(!al.get(i).contains("N")) {
				count++;
			}
			else
			{
				;
				MaxOccur.add(count);
				count=0;
			}
	
		}
		
		System.out.println(Collections.max(MaxOccur));
		scn.close();
		
	}

}
