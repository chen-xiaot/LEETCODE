package ArrayEasy;

import java.util.Arrays;

public class No88MergeSortedArray {

	public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1;
        int j = n-1;
        int k = m+n-1;
        
        while(i>=0&&j>=0){
            if(nums1[i]>nums2[j]){
                nums1[k]=nums1[i];
                k--;
                i--;
            }
            else{
                nums1[k]=nums2[j];
                k--;
                j--;
            }
        }
        
        while(j>=0){
            nums1[k]=nums2[j];
            k--;
            j--;
        }
    }
	
	
	
	public static void main(String[] args) {
		int[] dp = new int[]{2,3,0,0,0,0,0,0};
		int len = 2;
		int n = 7;
		System.out.println(Arrays.binarySearch(dp, 0, len, n));

	}

}
