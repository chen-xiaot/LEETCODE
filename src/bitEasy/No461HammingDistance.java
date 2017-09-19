package bitEasy;

public class No461HammingDistance {

public int hammingDistance(int x, int y) {
        
        int count = 0;
        int xory = x ^ y;
        
        while(xory != 0){
            if((xory & 1) == 1){
                count++;
            }
            xory = xory >> 1;
        }
        
        return count;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
