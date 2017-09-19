package leetcode20;

public class NO383RansomNote {

	public boolean canConstruct(String ransomNote, String magazine) {
        int[] count = new int[26];
        for(int i=0; i<magazine.length();i++){
            count [magazine.charAt(i) - 'a'] ++;
        }
        
        for(int j=0; j<ransomNote.length();j++){
            count [ransomNote.charAt(j) - 'a'] --;
        }
        
        for(int k=0; k<26;k++){
            if(count[k]<0) return false;
        }
        return true;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
