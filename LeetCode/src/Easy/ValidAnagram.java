package Easy;

import java.util.Arrays;

public class ValidAnagram {

	public static void main(String[] args) {
		System.out.println("If the two string are anagrams: "+validAnagram("rat", "car"));
		
	}
	public static boolean validAnagram(String s, String t)
	{
		char[] S = s.toCharArray();
		char[] T = t.toCharArray();
		Arrays.sort(S);
		Arrays.sort(T);
		if(Arrays.equals(S, T))
			return true;
		else
			return false;
	}
}
