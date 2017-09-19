package sortEasy;

public class No242ValidAnagram {

	 public boolean isAnagram(String s, String t) {   // first one time bug free
	        char[] ch1 = s.toCharArray();
	        char[] ch2 = t.toCharArray();
	        int[] res = new int[26];
	        
	        for(int i=0;i<=ch2.length-1;i++){
	            res[ch2[i]-'a']++;
	        }
	        
	        for(int i=0;i<=ch1.length-1;i++){
	            res[ch1[i]-'a']--;
	        }
	        
	        for(int i=0; i<=res.length-1;i++){
	            if(res[i]!=0) return false;
	        }
	        
	        return true;
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
