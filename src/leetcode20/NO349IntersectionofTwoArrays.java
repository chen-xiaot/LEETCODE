package leetcode20;

import java.util.HashSet;
import java.util.Set;

public class NO349IntersectionofTwoArrays {

	public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        
        for(int i =0; i<nums1.length; i++){
            set1.add(nums1[i]);
        }
        
        for(int j=0; j<nums2.length; j ++){
            if(set1.contains(nums2[j])){
                set2.add(nums2[j]);
            }
        }
        
        int[] res = new int[set2.size()];
        int index = 0;
        for (Integer num : set2) {        // how to get elements from a set
            res[index++] = num;
        }
        return res;
    }
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
