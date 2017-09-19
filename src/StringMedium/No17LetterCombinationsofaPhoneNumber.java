package StringMedium;

import java.util.LinkedList;
import java.util.List;

public class No17LetterCombinationsofaPhoneNumber {

	public List<String> letterCombinations(String digits) {
        LinkedList<String> res = new LinkedList<>(); // List<String> = new LinkedList<>();
                                                    //用不了 peek（）， why？
        if (digits.length() < 1 || digits == null) return res;
        res.add("");
        String[] map = new String[] {"0", "1", "abc", "def", "ghi", 
                                    "jkl", "mno", "pqrs", "tuv", "wxyz"};
        
        for (int i = 0; i < digits.length(); i++) {
            int x = Character.getNumericValue(digits.charAt(i));
            while (res.peek().length() == i) {
                String str = res.remove();
                for (char c : map[x].toCharArray()) {
                    res.add(str + c);
                }
            }
        }
        return res;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
