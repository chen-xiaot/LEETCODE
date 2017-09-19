package ArrayEasy;

public class No283MoveZeroes {

public void moveZeroes(int[] nums) {
        
        int i=0;
        
        for(int j=0;j<=nums.length-1;j++){
            if(nums[j]!=0){
                swap(nums,i,j);
                i++;
            }
        }
        
    }
    
    public static void swap(int[] arr, int i, int j){
        int temp=0;
        temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
