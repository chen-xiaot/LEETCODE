package mathEasy;

public class No202HappyNumber {

public boolean isHappy(int n) {
        
        int x = n, y = n;
        while(x>1){
            x=cal(x);
            if(x==1) return true;
            y=cal(cal(y));
            if(y==1) return true;
            if(x==y) return false;
        }
        
        return true;

    }
    
    public static int cal(int num){
            int res = 0;
            while(num>0){
                res = res + (num%10) * (num%10);
                num = num/10;
            }
            
            return res;
        }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
