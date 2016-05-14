package Easy;
import java.util.*;
public class ValidParentheses {

	public static void main(String[] args) {
		System.out.println("Check the parenthesis "+ isValid("(){}"));

	}
	public static boolean isValid(String s) 
	{
		if(s.length()==0 || s==null)
			return true;
		if(s.length()%2!=0)
			return false;
		char[] input = s.toCharArray();
		Stack<Character> stack = new Stack<Character>();
		
		for(int i =0; i < s.length() ; i++)
		{
			if(stack.isEmpty())
			{
				stack.push(input[i]);
			}
			else
			{
				if(input[i]==')'&&stack.peek()=='(' || input[i]=='}'&&stack.peek()=='{'||input[i]==']'&&stack.peek()=='[')
				{	stack.pop();
					continue;
				}
				else
				{
					stack.push(input[i]);
				}
			}
			
		}
		return stack.isEmpty();
	}
}
