package secondLargestNumberMethod2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecondLargestNumberMethod2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,5,6,1,9,13};
		int temp;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
		
		System.out.println("Largest number in the array is "+arr[arr.length-1]);
		System.out.println("Second Largest number in the array is "+arr[arr.length-2]);
		
		List<Integer> integersList=new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++) {
			integersList.add(arr[i]);
		}
		
		Collections.sort(integersList, Collections.reverseOrder());
		
		Object[] a=integersList.toArray();
		System.out.print("Reversed order sorted array is ");
		for(int i=0;i<arr.length;i++) {
		System.out.print(a[i]+" ");	                         
		}
		
	}

}
