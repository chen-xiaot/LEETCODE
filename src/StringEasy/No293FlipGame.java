package StringEasy;

import java.util.ArrayList;
import java.util.List;

public class No293FlipGame {

	public List<String> generatePossibleNextMoves(String s) {
        List<String> list = new ArrayList<>();
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == '+' && s.charAt(i - 1) == '+') {
                list.add(s.substring(0, i - 1) + "--" + s.substring(i + 1, s.length()));
            }
        }
        return list;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
