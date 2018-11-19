package stringReverseRecursion;

public class StringReverseRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="I am Back";
		
		System.out.println("Reverse of the string is : "+reverseString(s));
		
	}
		public static String reverseString(String a) {
			
			if(a.length()==0 || a=="")
				return a;
			else
				return a.substring(a.length()-1)+reverseString(a.substring(0,a.length()-1));
		

	}

}
