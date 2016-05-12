package Easy;

public class RemoveDuplicates {

	public static void main(String[] args) {
		int[] nums = {1,1,2};
		System.out.println("The length without duplicate array : "+ removeDuplicates(nums));

	}
	public static int removeDuplicates(int[] nums) {
		
		if(nums.length < 2)
			return nums.length;
		int len = 1;
		for(int i =0; i < nums.length-1; i++)
		{
			if(nums[i] == nums[i+1])
				continue;
			else
			{
				nums[len] = nums[i+1];
				len++;
			}
		}
		return len;
	}

}
