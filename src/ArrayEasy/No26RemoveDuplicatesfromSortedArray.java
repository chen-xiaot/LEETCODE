package ArrayEasy;

public class No26RemoveDuplicatesfromSortedArray {

public int removeDuplicates(int[] nums) {
        
        if (nums.length<1) return 0;
        
        int i = 0;
        
        for(int j=1;j<=nums.length-1;j++){
            if(nums[i]!=nums[j]){
                i++;
                nums[i]=nums[j];
            }
        }
        
        return i+1;
    }
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
