



























































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































package Easy;

public class ReverseInteger {

	public static void main(String[] args) {
		System.out.println("The reverse of the integer " + reverseint(-1234));

	}
	
	public static int reverseint(int x)
	{
		boolean flag=false;
		int num =x;
		int reverse =0;
		if (num < -2147483647 || num > 2147483647)
	            return 0;
		if(x<0)
		{
			flag = true;
			num = 0 - num;
		}
		while(num!=0)
		{
			int mod = num % 10;
			num /= 10;
			reverse = reverse * 10 + mod;
		}
		if(flag)
		{
			reverse = 0-reverse;
		}
		return reverse;
	}

}
