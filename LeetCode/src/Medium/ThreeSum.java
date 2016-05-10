package Medium;
import java.util.*;
public class ThreeSum {

	public static void main(String[] args) {
		int[] arr = {-1,0,1,2,-1,4};
		List<List<Integer>> result = threeSum(arr);
		System.out.println(result);
	}
	public static List<List<Integer>> threeSum(int[] num)
	{
		List<List<Integer>> result = new ArrayList<>();
		int n = num.length;
		if(n < 3)
			return result;
		Arrays.sort(num);
		int i =0;
		while(i < n -2)
		{
			int start = i + 1, end = n -1;
			while(start< end)
			{
				int sum = num[i] + num[start] + num[end];
				if(sum==0)
				{
					result.add(Arrays.asList(num[i], num[start], num[end]));
					do
					{
						end--;
					}
					while(end> start && num[end]==num[end+1]);
					do
					{
						start++;
					}
					while(start< end && num[start]==num[start-1]);
				}
				else if(sum >0)
				{
					do
					{
						end--;
					}
					while(end> start && num[end]==num[end+1]);
				}
				else
				{
					do
					{
						start++;
					}
					while(start< end && num[start]==num[start-1]);
				}
			}
			do
			{
				i++;
			}
			while(i < n-2 && num[i]==num[i-1]);
		}
		return result;
	}
}
