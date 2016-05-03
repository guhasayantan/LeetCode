package Easy;
/* 
Given an array of integers, return indices of the two numbers such that they add up to a specific target.
You may assume that each input would have exactly one solution.
Example:
Given nums = [2, 7, 11, 15], target = 9,
Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
*/

public class TwoSum {

	public static void main(String[] args) {
		int[] nums ={2, 7, 11, 15};
		int target = 9;
		TwoSum twosum = new TwoSum();
		int[] result = twosum.twoSum(nums, target);
		for(int i=0;i<result.length;i++){
			System.out.print(result[i]+" ");
		}

	}
	public int[] twoSum(int[] nums, int target) {
        int i, j;
        int[] A = new int[2];
        int length = nums.length;
        for (i=0;i<length;i++)
        {
            for(j=i+1;j<length;j++)
            {
                if(nums[i]+nums[j]==target)
                {
                    A[0]=i;
                    A[1]=j;
                    
                }
            }
        }        
        return A;
    }

}
