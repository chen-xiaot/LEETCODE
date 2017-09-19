package leetcode10;

public class leetcode10 {
    public int[] twoSum(int[] nums, int target) {
        int[] twosum=new int[2];
        for(int i=0; i<nums.length;i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i]+nums[j]==target){
                    twosum[0]=i;
                    twosum[1]=j;
                }
            }
        }
            return twosum;
    }

	public static void main(String[] args) {
		leetcode10 tester = new leetcode10();
		int[] nums={1,2,3,4,5}; int target =7;
		System.out.println(tester.twoSum(nums, target));
	}
}
