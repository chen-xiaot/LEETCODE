package StringEasy;

public class No125ValidPalindrome {

	public boolean isPalindrome(String s) {
        String pure = s.replaceAll("[^A-Za-z0-9]","");
        String upperPure = pure.toUpperCase();
        
        int i=0, j=upperPure.length()-1;
        while(i<j){
            if(upperPure.charAt(i)!=upperPure.charAt(j)){
                return false;
            }
            else {
                i++;
                j--;
            }
        }
        
        return true;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
