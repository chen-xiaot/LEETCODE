package bitEasy;

public class No342PowerofFour {

	public boolean isPowerOfFour(int num) {
        return num>0 && (num & (num-1)) == 0 && (num-1) % 3 ==0;
        
        // num & (num-1) == 0  is power of two
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
