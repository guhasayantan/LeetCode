package Easy;

public class StringToInteger {

	public static void main(String[] args) {
		System.out.println("The String to Integer "+ atoi("-190894"));

	}
	public static int atoi(String s)
	{
		if(s==null)
			return 0;
		int i =0;
		int signcount =0;
		boolean isNegative = false;
		while(i< s.length())
		{
			if(signcount ==0 && s.charAt(i)==' ')
			{
				
			}
			else if (signcount == 0 && (s.charAt(i)=='+' || s.charAt(i)=='-'))
			{
				signcount++;
				if(s.charAt(i)=='+')
					isNegative=false;
				else if (s.charAt(i)=='-')
					isNegative=true;
			}
			else if(s.charAt(i)<'0' || s.charAt(i)>'9')
			{
				return 0;
			}
			else
				break;
			i++;
		}
		long result =0;
		while(i < s.length())
		{
			if(s.charAt(i)<'0' || s.charAt(i)>'9')
				break;
			result = result * 10 + s.charAt(i) - '0';
			if(result > Integer.MAX_VALUE)
			{
				if(isNegative)
					return Integer.MIN_VALUE;
				else
					return Integer.MAX_VALUE;
			}
			i++;
		}
		if(isNegative)
			return -(int)result;
		else
			return (int)result;
	}

}
