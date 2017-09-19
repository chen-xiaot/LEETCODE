package mathEasy;

public class No9PalindromeNumber {

	public boolean isPalindrome(int x) {
		
        if(x<0) return false;
        if(x!=0 && x%10 == 0) return false;   // 0 is palindrome 
        
        int res = 0;
        while(x>res){
            res = res*10 + x%10;
            x = x/10;
        }
        
        return((res==x)|| (x == res/10));   // 12321   and   123321
        									// res:123   res:123
        									// x: 12     x: 123
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
