package mathMedium;

public class No311SparseMatrixMultiplication {

	public int[][] multiply(int[][] A, int[][] B) {
        int m = A.length, nA = A[0].length, nB = B[0].length;
        int[][] res = new int[m][nB];
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < nA; j++) {
                if (A[i][j] != 0) {
                    for (int k = 0; k < nB; k++) {
                        if (B[j][k] != 0) {
                            res[i][k] += A[i][j] * B[j][k];
                        }
                    }
                }
            }
        }
        return res;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
