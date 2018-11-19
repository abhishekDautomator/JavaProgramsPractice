package replaceElementArrayList;

import java.util.ArrayList;
//import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ReplaceElementArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> l=new ArrayList<String>();
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the number of elements to enter");
		int i=Integer.parseInt(scn.nextLine());
		System.out.println("Enter the list of elements");
		while(i!=0)
		{
			
				l.add(scn.nextLine());
				i--;
		}
		
		System.out.println("Entered array is :");
		System.out.println(l);
		
		String oldEle="",newEle="";
		System.out.println("Enter the element to replace:");
		oldEle=scn.nextLine();
		System.out.println("Enter the new element to replace with:");
		newEle=scn.nextLine();
		Collections.replaceAll(l,oldEle,newEle);
		System.out.println("List with replaced element is :"+l);
		scn.close();
		}
	
	static boolean replaceElement(List<String> l,String replacingElement,String newElement) {
		return Collections.replaceAll(l, replacingElement, newElement);
		
	}

}
