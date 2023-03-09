package week1.day2;

import java.util.Arrays;

public class Findduplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int nums[] = { 2,5,7,7,5,9,2,3};

Arrays.sort(nums);
int len = nums.length;
for (int i = 0; i < len ; i++) {
	
	for (int j=i+1; j < len; j++)
	{
		if(nums[i]== nums[j]) {
			System.out.println(nums[i] + "is duplicate");
		}
		}
}

	}

}
