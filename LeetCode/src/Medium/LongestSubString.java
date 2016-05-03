package Medium;
import java.util.*;
/*
Given a string, find the length of the longest substring without repeating characters.
Examples:
Given "abcabcbb", the answer is "abc", which the length is 3.
Given "bbbbb", the answer is "b", with the length of 1.
Given "pwwkew", the answer is "wke", with the length of 3. 
Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
*/
public class LongestSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="abcabcbb";
		int len = s.length();
		int result=0;
		for(int i=0; i < len; i++)
		{
			for(int j=i+1; j< len;j++)
			{
				if(isunique(s, i,j))
					result = Math.max(result, j-i);
			}
		}
		System.out.println("The length of longest substring: "+result);
	}
	public static boolean isunique(String s, int start, int end)
	{
		Set<Character> set = new HashSet<Character>();
		for(int i=start; i<end; i++){
			if(set.contains(s.charAt(i))){
				return false;
			}
			set.add(s.charAt(i));
		}
		return true;
	}
}
