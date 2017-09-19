package leetcode10;

public class NO461HammingDistance {
	
public int hammingDistance(int x, int y) {
        
        int xor = x ^ y;
        int count=0;
        
        while(xor!=0){
            if((xor&1)!=0)
            count ++;
            xor=xor>>1;
        }
        
        return count;
        
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
