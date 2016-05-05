package Easy;

public class PanlindromeNumber {

	public static void main(String[] args) {
		PanlindromeNumber pal = new PanlindromeNumber();
		System.out.println("Check if the number is palindrome "+pal.isPandrome(121));

	}
	public boolean isPandrome(int x)
	{
		int reverse = 0;
		int temp =0;
		int num =x;
		boolean flag = false;
		if(num<0)
		{
			flag = true;
			num = 0 - num;
		}
		while(num!=0)
		{
			temp = num %10;
			num = num /10;
			reverse = reverse * 10 + temp;
		}
		if(x == reverse)
			return true;
		else
			return false;
	}

}
