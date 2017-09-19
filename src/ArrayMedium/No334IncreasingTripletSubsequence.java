package ArrayMedium;

public class No334IncreasingTripletSubsequence {

	public boolean increasingTriplet(int[] nums) {
        int firstBig = Integer.MAX_VALUE, secondBig = Integer.MAX_VALUE;
        for (int n : nums) {
            if (n <= firstBig) {
                firstBig = n;
            }
            else if (n <= secondBig) {
                secondBig = n;
            }
            else return true;
        }
        return false;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
