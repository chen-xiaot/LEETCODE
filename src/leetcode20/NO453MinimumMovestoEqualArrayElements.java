package leetcode20;

public class NO453MinimumMovestoEqualArrayElements {

public int minMoves(int[] nums) {
        
        if(nums.length==0) return 0;
        
        int min=nums[0];
        for(int i=0;i<nums.length;i++){
            min=Math.min(min,nums[i]);
        }
        int res=0;
        for(int i=0;i<nums.length;i++){
            res+=nums[i]-min;
        }
        
        return res;
        
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
