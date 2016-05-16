package Easy;

public class ImplementstrStr {

	public static void main(String[] args) {
		System.out.println("The index is: "+ strStr("WorldHelloWorld", "Hello"));

	}
	public static int strStr(String haystack, String needle) {
		int hlength = haystack.length();
		int nlength = needle.length();
		if(hlength==0)
		    return -1;
		if(nlength==0)
		    return 0;
		if(haystack==needle)
		    return 0;
		char[] n = needle.toCharArray();
		char[] h = haystack.toCharArray();
		for(int i = 0; i < hlength; i++)
	    {
	        if(nlength > hlength - i)
	        {
	            return -1;
	        }

	        if(h[i] == n[0])
	        {
	            int j = 0;
	            for(; j < nlength; j++)
	            {
	                if(n[j] != h[i + j])
	                {
	                    break;
	                }
	            }

	            if(j == nlength && n[j-1] == h[i + j-1])
	            {
	                return i;
	            }
	        }
	    }

	    return -1;
	}
}
