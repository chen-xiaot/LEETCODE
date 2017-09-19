package Design;

import java.util.Random;

public class No398RandomPickIndex {

	int[] nums;
    Random random;
    
    public No398RandomPickIndex(int[] nums) {
        this.nums = nums;
        this.random = new Random();
    }
    
    public int pick(int target) {
        int res = -1;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                if (random.nextInt(++count) == 0) {
                    res = i;
                }
            }
        }
        return res;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
