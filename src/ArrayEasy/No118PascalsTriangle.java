package ArrayEasy;

import java.util.ArrayList;
import java.util.List;

public class No118PascalsTriangle {

	public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<List<Integer>>();
        
        for(int i=0; i<= numRows-1; i++){
            List<Integer> row = new ArrayList<Integer>();
            
            for(int j = 0; j<=i; j++){
                if(j==0 || j==i){
                    row.add(1);
                }
                else{
                    row.add(triangle.get(i-1).get(j-1)+triangle.get(i-1).get(j));
                }
            }
            
            triangle.add(row);
        }
        return triangle;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
