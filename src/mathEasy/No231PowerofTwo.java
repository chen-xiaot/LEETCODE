package mathEasy;

public class No231PowerofTwo {

	public boolean isPowerOfTwo(int n) {
        int count = 0;
        while(n>0){
            if((n&1) !=0){
                count++;
            }
            n = n>>>1;
        }
        
        return count==1;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
