package mathEasy;

public class No537ComplexNumberMultiplication {

	public String complexNumberMultiply(String a, String b) {
        String[] x = a.split("\\+|i");
        String[] y = b.split("\\+|i");
        int x1 = Integer.parseInt(x[0]);
        int x2 = Integer.parseInt(x[1]);
        int y1 = Integer.parseInt(y[0]);
        int y2 = Integer.parseInt(y[1]);
        return (x1 * y1 - x2 * y2) + "+" + (x1 * y2 + x2 * y1) + "i";
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
