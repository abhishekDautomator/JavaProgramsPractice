package streakNumber;

import java.util.Scanner;

public class StreakNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String inputString = s.nextLine();
      int L=inputString.length();
      int num=Integer.parseInt(inputString);
      int E=0,O=0,j=0,i=num,temp;
      while(i!=0){
        temp=i%10;
        if((j%2)==0)
        	E+=temp;
        else
          if(temp*2<L)
          	O+=(temp*2);
        i=i/10;j++;
      }
		int S=E+O;
      	for(int k=0;;k++){
          if((S+k)%(k+1)!=0){
            System.out.println(k);break;
          }
          	
        }
		
      	s.close();

	}

}
