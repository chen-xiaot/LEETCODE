package ArrayMedium;

public class No73SetMatrixZeroes {

	public void setZeroes(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int col0 = 1;
        
        for (int i = 0; i < row; i++) {
            if (matrix[i][0] == 0) col0 = 0; // col0负责第一列
            for (int j = 1; j < col; j++) {  // 跳过第一列，从第二列开始
                if (matrix[i][j] == 0) {
                    matrix[i][0] = matrix[0][j] = 0; //把状态存储在每一行以及每一列的第一个cell
                }
            }
        }
        
        for (int i = row - 1; i >= 0; i--) {
            for (int j = col - 1; j >= 1; j--) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
            if (col0 == 0) matrix[i][0] = 0; //如果col0 ＝＝ 0， 说明第一列要全为0；
        }
    }

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
