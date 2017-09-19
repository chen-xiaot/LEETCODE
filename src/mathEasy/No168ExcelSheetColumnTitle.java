package mathEasy;

public class No168ExcelSheetColumnTitle {

	public String convertToTitle(int n) {
        StringBuilder sb = new StringBuilder();
        int x = 0;
        while(n>0){
            n--;
            x = n%26;
            sb.append((char)('A'+x));
            n = n / 26;
        }
        return sb.reverse().toString();
    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
