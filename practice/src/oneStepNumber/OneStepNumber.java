package oneStepNumber;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OneStepNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter two integers within which we have to identify all one-step-numbers including those numbers");
		Scanner scan=new Scanner(System.in);
		int first=Integer.parseInt(scan.nextLine());
		int last=Integer.parseInt(scan.nextLine());
		System.out.println("All such one-step-numbers are :");
		int count=0;String s="";
		for(int i=first;i<=last;i++) {
			List<Integer> l=new ArrayList<Integer>();
			
			int num=i;
			while(num!=0) {
				l.add(num%10);
				num/=10;
			}
			//System.out.println(l.toString());
			boolean flag=true;
			for(int j=0;j<l.size()-1;j++) {
				if(Math.abs(l.get(j)-l.get(j+1))!=1) {
					flag=false;break;
				}
			}
			
			if(flag==true) {
				count++;
				s+=Integer.toString(i)+" ";
			}
		}
		if(count==0)System.out.println(-1);
		else System.out.println(s.trim().replaceAll(" ", ", "));
		
		scan.close();
	}

}
