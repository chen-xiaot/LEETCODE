package mathEasy;

public class No13RomantoInteger {

	public int romanToInt(String s) {
        int sum=0;
        
        if (s.indexOf("IV") != -1) {sum -= 2;}  // IV = 4, I = 1, V = 5
        if (s.indexOf("IX") != -1) {sum -= 2;}  // IX = 9, I = 1, X = 10
        if (s.indexOf("XL") != -1) {sum -= 20;} // XL = 40, X = 10, L = 50
        if (s.indexOf("XC") != -1) {sum -= 20;} // XC = 90, X = 10, C = 100
        if (s.indexOf("CD") != -1) {sum -= 200;} // CD = 400, C = 100, D = 500
        if (s.indexOf("CM") != -1) {sum -= 200;} // CM = 900, C = 100, M = 1000
    
        char[] c = s.toCharArray();

       for(int i = 0; i <= s.length() - 1; i++){
            if (c[i] == 'M') sum += 1000;
            if (c[i] == 'D') sum += 500;
            if (c[i] == 'C') sum += 100;
            if (c[i] == 'L') sum += 50;
            if (c[i] == 'X') sum += 10;
            if (c[i] == 'V') sum += 5;
            if (c[i] == 'I') sum += 1;
       
        }
        return sum;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
