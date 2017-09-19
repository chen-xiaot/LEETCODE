package StringEasy;

import java.util.HashMap;
import java.util.Map;

public class No290WordPattern {

	public boolean wordPattern(String pattern, String str) {
        String[] words = str.split(" ");
        Map<Character, String> map = new HashMap<Character, String>();
        if (words.length != pattern.length()) return false;
        
        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            if (map.containsKey(c)) {
                if (!map.get(c).equals(words[i])) return false;
            }
            else {
                if (map.containsValue(words[i])) return false;
                map.put(c, words[i]);
            }
        }
        return true;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
