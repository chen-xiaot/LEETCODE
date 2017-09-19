package mathEasy;

//range : 1 - 3999
public class No12IntegertoRoman {

	public String intToRoman(int num) {
        String[] M = {"", "M", "MM", "MMM"}; // 1000 2000 3000
        String[] C = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"}; // 100 200 300 ...
        String[] X = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"}; // 10 20 30 ...
        String[] I = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"}; // 1 2 3 ...
        
        return M[num / 1000] + C[(num % 1000) / 100] + X[(num % 100) / 10] + I[num % 10];
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
