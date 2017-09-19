package leetcode20;

import java.util.HashSet;

public class NO409LongestPalindrome {

	public int longestPalindrome(String s) {
        if (s==null || s.length()==0) return 0;
        HashSet<Character> set = new HashSet<Character>();  // character
        int count=0;
        for(int i=0;i<s.length();i++){
            if(set.contains(s.charAt(i))){
                set.remove(s.charAt(i));
                count++;
            }
            else{
                set.add(s.charAt(i));
            }
        }
        
        if(set.isEmpty()){
            return count*2;
        }
        return count*2+1;
        
    }
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
