package StringEasy;

public class No520DetectCapital {

	public boolean detectCapitalUse(String word) {
        return word.matches("[A-Z]+|[a-z]+|[A-Z][a-z]+");
    }
	
	public boolean detectCapitalUse2(String word) {
		int cnt = 0;
        for(char c: word.toCharArray()) if('Z' - c >= 0) cnt++;
        return ((cnt==0 || cnt==word.length()) || (cnt==1 && 'Z' - word.charAt(0)>=0));
    }
	
	public boolean detectCapitalUse3(String word) {
		int count =0;
        for(int i =0; i<=word.length()-1;i++){
            if('Z' - word.charAt(i) >=0)     // ASCA II   [A-Z] ... [a-z]
                count++;
        }
        
        if(count ==0) return true;
        else if(count == word.length()) return true;
        else if(count == 1 && 'Z' - word.charAt(0) >=0) return true;
        else return false;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
