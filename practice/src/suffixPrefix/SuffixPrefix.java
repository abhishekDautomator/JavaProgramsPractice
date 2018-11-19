package suffixPrefix;

import java.util.Scanner;

public class SuffixPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String inputString = s.nextLine();
		if(inputString.length()!=0) {
      	if(inputString.length()%2==0){
          if(inputString.substring(0,(inputString.length()/2)).equals(inputString.substring((inputString.length()/2),inputString.length())))
            System.out.println(inputString.length()/2);
          else
            System.out.println(0);
        }
      else {
        if(inputString.substring(0,(inputString.length()/2)).equals(inputString.substring((inputString.length()/2)+1,inputString.length())))
            System.out.println(inputString.length()/2);
        else
            System.out.println(0);
      }
		}
		else
			System.out.println(0);
	s.close();
	}

}
