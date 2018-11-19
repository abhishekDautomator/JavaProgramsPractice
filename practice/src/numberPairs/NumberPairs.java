package numberPairs;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class NumberPairs {
		
		    // Complete the sockMerchant function below.
		    static int sockMerchant(int n, int[] ar) {
		        Arrays.sort(ar);
		        int repeat=1,sum=0;
		        for(int i=0;i<n-1;i++){
		            
		            if(ar[i]==ar[i+1])
		                repeat++;
		            else
		            { sum+=(repeat/2);
		            repeat=1;}
		            
		                
		        }
		        return sum;
		    }

		    

		    public static void main(String[] args) throws IOException {
		        int[] arr= {1,1,3, 1, 2, 1, 3, 3, 3, 3};
		        System.out.println(sockMerchant(arr.length,arr));
		    }

	}


