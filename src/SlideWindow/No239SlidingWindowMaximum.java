package SlideWindow;

import java.util.ArrayDeque;
import java.util.Deque;

public class No239SlidingWindowMaximum {

	public int[] maxSlidingWindow(int[] nums, int k) {
        if (k <= 0 || nums.length == 0 || nums == null) {
            return new int[0];
        }
        int len = nums.length;
        int index = 0;
        int[] res = new int[len - k + 1];
        Deque<Integer> dq = new ArrayDeque<>(); // save index;
        
        for (int i = 0; i < len; i++) {
            while (!dq.isEmpty() && dq.peek() < i - k + 1) {
                dq.poll();
            }
            
            while (!dq.isEmpty() && nums[dq.peekLast()] < nums[i]) {
                dq.pollLast();
            }
            dq.offer(i);
            if (i >= k - 1) {
                res[index++] = nums[dq.peek()];
            }
        }
        return res;
    }
	
	
	// Window position                Max
	// ---------------               -----
	// [1  3  -1] -3  5  3  6  7       3
	//  1 [3  -1  -3] 5  3  6  7       3
	//  1  3 [-1  -3  5] 3  6  7       5
	//  1  3  -1 [-3  5  3] 6  7       5
	//  1  3  -1  -3 [5  3  6] 7       6
	//  1  3  -1  -3  5 [3  6  7]      7
	//  |  |   |   |  |  |  |  |
	//  0  1   2   3  4  5  6  7  <- index

	//  i = 0, q: 0, 
	//  i = 1, q: null; q: 1
	//  i = 2, q: 1, 2, res[0] = a[1] = 3
	//  i = 3, q: 1, 2, 3, res[1] = a[1] = 3
	//  i = 4, q: 2, 3, q: null, q: 4, res[2] = a[4] = 5
	//  i = 5, q: 4, 5, res[3] = a[4] = 5
	//  i = 6, q:null, q: 6, res[4] = a[6] = 6
	//  i = 7, q:null, q: 7, res[5] = a[7] = 7 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
