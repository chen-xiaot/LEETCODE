package ArrayMedium;

public class No238ProductofArrayExceptSelf {

	public int[] productExceptSelf(int[] nums) {  // [1, 2, 3, 4]
        int size = nums.length;
        int[] res = new int[size];
        res[0] = 1;
        
        for (int i = 1; i < size; i++) {
            res[i] = res[i - 1] * nums[i - 1];  //   [1, 1, 2, 6]
        }
        
        int right = 1;
        for (int i = size - 1; i >= 0; i--) {  //   [24, 12, 8, 6]
            res[i] *= right;
            right *= nums[i];
        }
        return res;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
