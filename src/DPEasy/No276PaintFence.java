package DPEasy;

public class No276PaintFence {

	public int numWays(int n, int k) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return k;
        }
        int diffColorCounts = k * (k - 1);
        int sameColorCounts = k;
        for (int i = 2; i < n; i++) {
            int temp = diffColorCounts;
            diffColorCounts = (diffColorCounts + sameColorCounts) * (k - 1);
            sameColorCounts = temp;
        }
        return diffColorCounts + sameColorCounts;
    }

	// 3 posts and 3 colors, first two posts:
	// (1,1), (1,2), (1,3), (2,1), (2,2), (2,3), (3,1), (3,2), (3,3).
	// diffColorCounts = 6;
	// sameColorCounts = 3;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
