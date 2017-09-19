package ArrayMedium;

import java.util.ArrayList;
import java.util.List;

public class No54SpiralMatrix {

	public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        if (matrix == null || matrix.length == 0) return res;
        int m = matrix.length, n = matrix[0].length;
        int rowBgn = 0, rowEnd = m - 1, colBgn = 0, colEnd = n - 1;
        
        while (rowBgn <= rowEnd && colBgn <= colEnd) {
            
            for (int i = colBgn; i <= colEnd; i++) {
                res.add(matrix[rowBgn][i]);
            }
            rowBgn++;
            
            for (int i = rowBgn; i <= rowEnd; i++) {
                res.add(matrix[i][colEnd]);
            }
            colEnd--;
            
            if (rowBgn <= rowEnd) {
                for (int i = colEnd; i >= colBgn; i--) {
                    res.add(matrix[rowEnd][i]);
                }
            }
            rowEnd--;
            
            if (colBgn <= colEnd) {
                for (int i = rowEnd; i >= rowBgn; i--) {
                    res.add(matrix[i][colBgn]);
                }
            }
            colBgn++;
        }
        return res;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
