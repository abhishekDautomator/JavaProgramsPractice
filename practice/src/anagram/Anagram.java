package anagram;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="rat";
		String b="tar";
				if(tostring(a).equals(tostring(b)))
		            System.out.println(true);
		        else
		        	System.out.println(false);
		    }
		
		    
static String tostring(String a){
    char[] s1=a.toLowerCase().toCharArray();
    Arrays.sort(s1);
    String o=new String(s1);
    return o;
}
}
