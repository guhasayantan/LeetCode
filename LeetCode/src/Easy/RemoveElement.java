package Easy;

import java.util.ArrayList;

public class RemoveElement {

	public static void main(String[] args) {
		int[] nums = {3,2,2,3};
		int val =3;
		System.out.println(removeElement(nums, val));

	}
	public static int removeElement(int[] nums, int val) {
	
		int start =0;
		int end = nums.length -1;
		
		while(start <= end)
		{
			if(nums[start] == val)
			{
				if(nums[end]==val)
				{
					--end;
				}
				else
				{
					nums[start]= nums[end];
					++start;
					--end;
				}
			}
			else
			{
				++start;
			}
		}
		return start;
	}
}
