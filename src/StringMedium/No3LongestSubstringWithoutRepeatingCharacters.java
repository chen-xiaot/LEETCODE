package StringMedium;

import java.util.HashMap;
import java.util.Map;

public class No3LongestSubstringWithoutRepeatingCharacters {

	public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0 || s == null) return 0;
        Map<Character, Integer> map = new HashMap<>();
        int longest = 0;
        int left = 0;
        for (int right = 0; right < s.length(); right++) {
            Integer value = map.get(s.charAt(right));
            if (value != null) {
                left = Math.max(left, value + 1);      // a  b  b  a
            }                                         //  0  1  2  3
            map.put(s.charAt(right), right);
            longest = Math.max(longest, right - left + 1);
        }
        return longest;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
