package mathMedium;

public class No50Powx_n {

	public double myPow(double x, int n) {
        return pow(x, (long) n);
    }
    
    private static double pow(double x, long n) {
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            n = - n;      // Integer.MAX_VALUE，即2147483647, Integer.MIN_VALUE -2147483648
            x = 1 / x;
        }
        return (n % 2 == 0) ? pow(x * x, n / 2) : x * pow(x * x, n / 2);
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
