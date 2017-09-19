package leetcode10;

public class NO27removeElement {

	public int removeElement(int[] nums, int val) {
        if(nums.length==0) return 0;
        int i=0;
        for(int j=0;j<nums.length;j++){
            if (nums[j]!=val){
                nums[i]=nums[j];
                i++;
            }
        }
        
////////////////////////////////////////////
for(int k=0;k<nums.length;k++){
System.out.println(nums[k]);                  // ???????????????
}
////////////////////////////////////////////
        System.out.println(i);
        return i;
    }
	
	public static void main(String[] args) {
		NO27removeElement tester=new NO27removeElement();
		int[] nums=new int[]{3,2,2,3};
		tester.removeElement(nums, 3);
	}

}
