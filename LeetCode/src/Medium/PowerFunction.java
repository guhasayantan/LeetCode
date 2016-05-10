package Medium;

public class PowerFunction {

	public static void main(String[] args) {
		System.out.println("The power function: "+MyPow(4.5, 8));

	}
	public static double MyPow(double x, int n) {
        double ans = 1;
        long absN = Math.abs((long)n);
        while(absN > 0) {
            if((absN&1)==1) ans *= x;
            absN >>= 1;
            x *= x;
        }
        return n < 0 ?  1/ans : ans;
    }
}
