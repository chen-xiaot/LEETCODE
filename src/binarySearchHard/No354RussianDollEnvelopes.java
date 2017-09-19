package binarySearchHard;

import java.util.Arrays;
import java.util.Comparator;

public class No354RussianDollEnvelopes {

	public int maxEnvelopes(int[][] envelopes) {
        if(envelopes == null || envelopes.length == 0) return 0;
        
        int[] dp = new int[envelopes.length];
        int len = 0, index = 0;
        
        Arrays.sort(envelopes, new Comparator<int[]>() {
            @Override
            public int compare(int[] e1, int[] e2) {
                if (e1[0] != e2[0]) {
                    return Integer.compare(e1[0], e2[0]);
                }
                // if width is the same, order by height
                    return Integer.compare(e2[1], e1[1]);
            }
        });
        
        for(int[] envelope : envelopes) {
            index = Arrays.binarySearch(dp, 0, len, envelope[1]);
            if(index < 0) {
                index = -(index + 1);
            }
            dp[index] = envelope[1];
            if(index == len) len++;
        }
        
        return len;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
