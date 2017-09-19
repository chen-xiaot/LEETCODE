package mathMedium;

public class No396RotateFunction {

	public int maxRotateFunction(int[] A) {
        int allSum = 0;
        int len = A.length;
        int F = 0;
        for (int i = 0; i < len; i++) {
            F += i * A[i];      //: 25
            allSum += A[i];    // : 15
        }
        int max = F;
        for (int i = len - 1; i >= 1; i--) {
            F = F + allSum - len * A[i];   // 15 + 25 - 24 = 16 // 
            max = Math.max(F, max);
        }
        return max;   
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
