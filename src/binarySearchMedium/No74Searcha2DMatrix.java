package binarySearchMedium;

public class No74Searcha2DMatrix {

	//n * m matrix convert to an array => matrix[x][y] => a[x * m + y]
    //an array convert to n * m matrix => a[x] =>matrix[x / m][x % m];
    
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0 || matrix == null || matrix[0].length == 0) return false;
        int m = matrix.length, n = matrix[0].length;
        int left = 0, right = m * n - 1;
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (matrix[mid / n][mid % n] < target) {
                left = mid + 1;
            }
            else right = mid;
        }
        return matrix[right / n][right % n] == target;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
