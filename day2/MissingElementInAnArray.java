package week1.day2;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] Arr = {1,2,3,4,7,6,8};
		Arrays.sort(Arr);
		//length of the array
		int len = Arr.length;
		//formula to get the total sum of a range of numbers n(n+1)/2
		
		int sum = Arr[len-1]*(Arr[len-1] + 1)/2;
				
			for (int i=0; i < len; i++) 
		{
					
			sum = sum - Arr[i];			
				
				}
			System.out.println("Missing number in given series is " + sum);
		
		
		}
	}


