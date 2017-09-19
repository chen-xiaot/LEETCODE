package StringEasy;

import java.util.List;

public class No422ValidWordSquare {

	public boolean validWordSquare(List<String> words) {
        if (words == null || words.size() == 0) {
            return true;
        }
        int n = words.size();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < words.get(i).length(); j++) {
                if (j >= n || words.get(j).length() <= i || words.get(j).charAt(i) != words.get(i).charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }
	
//	  "abcd",
//	  "bnrt",
//	  "crm",
//	  "dt"  true;
//
//	  "abcdx", j >= n
//	  "bnrt",
//	  "crm",
//	  "dt"
//
//	  "abcd",
//	  "bnrt",
//	  "crm",
//	  "dtx"   i = 3, j = 0 -> 2 
	
//	  0 1 2  
//	  0 * * * 
//	  1 * * 
//	  2 * 
//	  3 *
//	  i = 3, j = 0
//	  i都到 3 了， means 竖着都4个数了，
//	  横着的不能少于4个数
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
