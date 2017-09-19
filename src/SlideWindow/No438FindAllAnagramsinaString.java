package SlideWindow;

import java.util.ArrayList;
import java.util.List;

public class No438FindAllAnagramsinaString {

	public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        if (s == null || s.length() == 0 || p == null || p.length() == 0) return list;
    
        int[] hash = new int[256]; 
        for (char c : p.toCharArray()) {
            hash[c]++;
        }
   
        int left = 0, right = 0, count = p.length();
    
        while (right < s.length()) {
            if (hash[s.charAt(right)] >= 1) { // 说明当前这个char是在p范围内的。
                count--;
            }
            hash[s.charAt(right)]--;
            right++;
        
            if (count == 0) {
                list.add(left);
            }

            if (right - left == p.length()) {
           
                if (hash[s.charAt(left)] >= 0) { // 说明当前这个char是在p范围内的。
                    count++;
                }
                hash[s.charAt(left)]++;
                left++;
            }
        }
        return list;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
