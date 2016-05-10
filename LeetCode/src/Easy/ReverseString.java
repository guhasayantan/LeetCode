package Easy;

public class ReverseString {

	public static void main(String[] args) {
		System.out.println("The reverse string:" + reverseString("abcd"));

	}
	public static String reverseString(String s)
	{
		char[] arr = s.toCharArray();
		int left = 0;
		int right = arr.length -1;
		for( left=0 ; left< right; left++, right--)
		{
			
				char temp = arr[left];
				arr[left] = arr[right];
				arr[right] =temp;
			
		}
		return String.valueOf(arr);
	}
}
