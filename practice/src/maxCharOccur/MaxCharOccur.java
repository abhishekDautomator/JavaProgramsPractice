package maxCharOccur;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MaxCharOccur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a string");
		String s=scan.nextLine();
		System.out.println("Character that occured max in the String with case sensitive is : "+maxCharOccur(s));
		System.out.println("Character that occured max in the String with case insensitive is : "+maxCharOccur(s.toLowerCase()));
		scan.close();
	}
	
	static Set<Character> maxCharOccur(String s) {
		char[] ch=s.toCharArray();
		HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
		
		for(char c:ch) {
			if(hm.containsKey(c)) {
				hm.put(c, hm.get(c)+1);
			}
			else {
				hm.put(c,1);
			}
		}
		
		int occurence=Collections.max(hm.values());Set<Character> maxOccurChar=new HashSet<Character>();
		for(Map.Entry<Character,Integer> e:hm.entrySet()) {
			if(e.getValue()==occurence) {
				maxOccurChar.add(e.getKey());
			}
		}
		
		return maxOccurChar;
	}

}
