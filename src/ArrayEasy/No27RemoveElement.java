package ArrayEasy;

public class No27RemoveElement {

	public int removeElement(int[] nums, int val) {
        int i = 0;
        
        for(int j=0;j<=nums.length-1;j++){
            if(nums[j]!=val){
                nums[i]=nums[j];
                i++;
            }
        }
        
        return i;
    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
