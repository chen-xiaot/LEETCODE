package StringEasy;

public class No246StrobogrammaticNumber {

	private static final String DICT = "00 11 88 69 96";
    public boolean isStrobogrammatic(String num) {
        for (int i = 0, j = num.length() - 1; i <= j; i++, j--) {
            if (!DICT.contains("" + num.charAt(i) + num.charAt(j))) {
                return false;
            }
        }
        return true;
    }
    
 // 1 8 1
 // i   j : 11
 //   i
 //   j : 88
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
