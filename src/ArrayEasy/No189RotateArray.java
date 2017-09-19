package ArrayEasy;

public class No189RotateArray {

public void rotate(int[] nums, int k) {
        
        
        k= k % nums.length;
        
        reverse(nums, 0, nums.length-1);
        reverse(nums, 0, k - 1);   // (0,k-1) error
        reverse(nums, k, nums.length-1);
    }
    
    public static void reverse(int[] nums, int left, int right){
        int temp=0;
        while(left<right){
            temp=nums[right];
            nums[right]=nums[left];
            nums[left]=temp;
            left++;
            right--;
        }
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
