package DPMedium;

public class No494TargetSum {

	public int findTargetSumWays(int[] nums, int S) {
        int sum = 0;
        for (int n : nums) {
            sum += n;
        }
        return sum < S || (sum + S) % 2 != 0 ? 0 : subsetSum(nums, (sum + S) / 2);
    }
    
    private int subsetSum(int[] nums, int target) {
        int[] dp = new int[target + 1];
        dp[0] = 1;
        // dp[i] : when target is i, how many combinations can be created by using n from nums[];
        for (int n : nums) {
            for (int i = target; i >= n; i--) {
                dp[i] += dp[i - n];
            }
        }
        return dp[target];
    }


  //nums[2, 3, 2, 1];  target = 3, return 3 combinations

  //n = 2 
  //for (i = 3 -> 2) {
//  	dp[3] = dp[3] + dp[1] = 0;
//  	dp[2] = dp[2] + dp[0] = 1;
  //}

  //n = 3
  //for (i = 3 -> 3) {
//  	dp[3] = dp[3] + dp[0] = 1;
  //}

  //n = 2
  //for (i = 3 -> 2) {
//  	dp[3] = dp[3] + dp[1] = 1;
//  	dp[2] = dp[2] + dp[0] = 2;
  //}

  //n = 1
  //for (i = 3 -> 1) {
//  	dp[3] = dp[3] + dp[2] = 3;
//  	dp[2] = dp[2] + dp[1] = 2;
//  	dp[1] = dp[1] + dp[0] = 1; 
  //}    
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
