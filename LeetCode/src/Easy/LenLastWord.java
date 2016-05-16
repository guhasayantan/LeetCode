package Easy;
import java.util.*;
public class LenLastWord {

	public static void main(String[] args) {
		System.out.println(lengthOfLastWord("Hello World"));

	}
	public static int lengthOfLastWord(String s) {
		String[] input = s.split(" ");
		int len = input.length;
		if(input==null||len==0)
			return 0;
		
		int result = input[len-1].length();
		return result;
	}
}
