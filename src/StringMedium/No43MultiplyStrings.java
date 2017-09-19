package StringMedium;

public class No43MultiplyStrings {

	public String multiply(String num1, String num2) {
        if (num1 == null || num2 == null || num1.length() == 0 || num2.length() == 0) {
            return "";
		}
        int m = num1.length();
        int n = num2.length();
        int[] pos = new int[m + n];
        
        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0'); 
                int p1 = i + j, p2 = i + j + 1;
                int sum = mul + pos[p2];
                
                pos[p1] += sum / 10;
                pos[p2] = (sum) % 10;
			}
		}
        
        StringBuilder sb = new StringBuilder();
        for (int p : pos) {
            if (p == 0 && sb.length() == 0) continue;
            sb.append(p);
		}
        return sb.length() == 0 ? "0" : sb.toString();  // 0 * 0 = 0
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
