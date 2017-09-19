package bitEasy;

public class No477TotalHammingDistance {

	public int totalHammingDistance(int[] nums) {
        int total = 0;
        for (int count = 0; count < 32; count++) {
            int bitCount = 0;
            for (int i = 0; i < nums.length; i++) {
                bitCount += (nums[i] >> count) & 1;
            }
            total += bitCount * (nums.length - bitCount);
        }
        return total;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
