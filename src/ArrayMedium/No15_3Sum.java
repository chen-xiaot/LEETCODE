package ArrayMedium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class No15_3Sum {

	public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums.length < 3) return res;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            if (i == 0 || i > 0 && nums[i] != nums[i - 1]) {
                int left = i + 1;
                int right = nums.length - 1;
                int sum = 0 - nums[i]; 
                                            // 先取nums［i］作为第一个数
                while (left < right) {     //再在剩下的数里找两个数
                    if (nums[left] + nums[right] == sum) {
                        res.add(Arrays.asList(nums[i], nums[left], nums[right])); //Arrays.asList();
                        while (left < right && nums[left] == nums[left + 1]) left++;
                        while (left < right && nums[right] == nums[right - 1]) right--; //de-duplicate
                        left++;
                        right--;
                    }
                    else if (nums[left] + nums[right] < sum) left++;
                    else right--;
                }
            }
        }
        return res;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
