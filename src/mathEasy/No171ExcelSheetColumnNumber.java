package mathEasy;

public class No171ExcelSheetColumnNumber {

	public int titleToNumber(String s) {
        int res = 0;
        for(int i =0; i<=s.length()-1;i++){
            res = res * 26 + s.charAt(i)-'A'+1;
        }
        
        return res;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
