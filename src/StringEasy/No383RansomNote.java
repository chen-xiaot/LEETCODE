package StringEasy;

public class No383RansomNote {

public boolean canConstruct(String ransomNote, String magazine) {
        
        int[] count = new int[26];
        
        for(int i=0;i<=magazine.length()-1; i++){
            int index=magazine.charAt(i) - 'a';
            count[index]++;
        }
        
        for(int j=0;j<=ransomNote.length()-1;j++){
            int index=ransomNote.charAt(j) - 'a';
            count[index]--;
            if(count[index]<0) return false;
        }
        
        return true;
    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
