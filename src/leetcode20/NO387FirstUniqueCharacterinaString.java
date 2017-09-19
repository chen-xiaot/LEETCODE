package leetcode20;

public class NO387FirstUniqueCharacterinaString {
	
public int firstUniqChar(String s) {
        
        int count[] = new int[26];
        for(int i=0;i<s.length();i++){
            count[s.charAt(i)-'a']++;
        }
        for(int j=0;j<s.length();j++){
            if (count[s.charAt(j)-'a']==1)
            return j;
        }
        return -1;
        
    }
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
