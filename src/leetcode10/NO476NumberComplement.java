package leetcode10;

public class NO476NumberComplement {

	 public int findComplement(int num) {
	        
	        int target=0, index=0;
	        
	        while(target<num){     // should not be <=
	            target = (int) (target+ Math.pow(2,index));
	            index++;
	        }
	        
	        return target-num;
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
