package lexicographicalOrder;

import java.util.Arrays;
import java.util.Scanner;

public class LexicographicalOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String smallest = "";
        String largest = "";
        
        Scanner scn=new Scanner(System.in);
        String s=scn.nextLine();
        
        // Complete the function
        String[] array=new String[s.length()-2];
        for(int i=0;i<s.length()-2;i++){
            array[i]=s.substring(i,i+3);   
        }
        /*String temp="";
        System.out.println(Arrays.toString(array));
        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++)
            {   if(array[i].compareTo(array[j])>0){
                    temp=array[j];
                    array[j]=array[i];
                    array[i]=temp;
            }    
            }
        }*/
        Arrays.sort(array);
        smallest=array[0];largest=array[array.length-1];
         System.out.println(smallest);
         System.out.println(largest);
         scn.close();

	}

}
