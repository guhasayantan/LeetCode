package Easy;

public class ReverseVowelsString {

	public static void main(String[] args) {
		String s = "hello";
		System.out.println("Reverse vowel of string is "+ reverseVowels(s));

	}
	public static String reverseVowels(String s) 
	{
		char[] input = s.toCharArray();
		int right = s.length() - 1;
		int left = 0;
		String vowels ="AEIOUaeiou";
		while(left < right)
		{
			if(vowels.indexOf(input[left])!=-1)
			{
				while(vowels.indexOf(input[right])==-1)
				{
					right--;
				}
				char temp = input[left];
				input[left] = input[right];
				input[right] = temp;
				left++;
				right--;
			}
			else
			{
				left++;
			}
		}
		return new String(input);
	}
}
