package Easy;
import java.util.*;
public class ZigZagConversion {

	public static void main(String[] args) {
		ZigZagConversion z = new ZigZagConversion();
		String s ="PAYPALISHIRING";
		String result = z.convert(s, 3);
		System.out.println(result);
	}
	public String convert(String s, int row)
	{
		if(row==0)
			return s;
		List<List<String>> t = new ArrayList<>(row);
		for(int i = 0; i< row; i++)
		{
			t.add(new ArrayList<String>());
		}
		char[] input = s.toCharArray();
		int[] pattern = getpattern(row);
		
		for(int i=0; i < s.length(); i++)
		{
			int r = pattern[i % pattern.length];
			t.get(r).add(String.valueOf(input[i]));
		}
		String result="";
		for (int i=0; i<t.size();i++)
		{
			result+=conncatString(t.get(i), "");
		}
		return result;
	}
	public int[] getpattern(int k)
	{
		if(k==0)
			return new int[]{0};
		int size = (k-1)*2;
		int[] pattern = new int[size];
		
		for(int i=0; i<size; i++)
		{
			if(i<k)
			{
				pattern[i]=i;
			}
			else
			{
				pattern[i]=(k-1)-(i-(k-1));
			}
		}
		return pattern;
	}
	
	public String conncatString(List<String> s, String sep)
	{
		StringBuilder sb = new StringBuilder();
		String sp="";
		for(String q:s)
		{
			sb.append(sp).append(q);
			sp=sep;
		}
		return sb.toString();
	}

}
