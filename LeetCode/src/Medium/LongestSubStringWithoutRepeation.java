package Medium;
import java.util.*;
public class LongestSubStringWithoutRepeation {

	public static void main(String[] args) {
		System.out.println("The longest sub string without repeating "+ findLonngestString("aainkliabcdefg"));
		

	}
	public static int findLonngestString(String s)
	{
		char[] input = s.toCharArray();
		HashMap<Character, Integer> hashmap = new HashMap<Character, Integer>();
		int pre=0;
		for(int i =0 ; i< s.length(); i++)
		{
			if(!hashmap.containsKey(input[i]))
			{
				hashmap.put(input[i], i);
			}
			else
			{
				pre = Math.max(pre, hashmap.size());
				i = hashmap.get(input[i]);
				hashmap.clear();
			}
		}
		return Math.max(pre, hashmap.size());
	}

}
