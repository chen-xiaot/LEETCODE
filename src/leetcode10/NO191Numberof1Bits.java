package leetcode10;

import java.util.Arrays;

public class NO191Numberof1Bits {

	// you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int sum=0;
        int mask=1;
        for(int i=0;i<32;i++){
        if((n & mask) !=0){
            sum++;
         }
            mask <<=1;
       }
        return sum;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr=new int[]{1,2};
	}

}
