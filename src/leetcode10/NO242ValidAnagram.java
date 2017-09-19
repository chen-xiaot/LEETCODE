package leetcode10;

public class NO242ValidAnagram {
	
	public boolean isAnagram(String s, String t) {
		int[] count=new int[26];

		for(int i=0;i<s.length();i++){
			count[s.charAt(i)-'a']++;
		}
		for(int k=0;k<t.length();k++){
			count[t.charAt(k)-'a']--;
		}
		
		for(int j=0;j<26;j++){
			if (count[j]!=0){
				return false;
			}
		}
		
		return true;
		
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
