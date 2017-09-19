package bitEasy;

import java.util.LinkedList;
import java.util.List;

public class No89GrayCode {

	// n = 2

	// 00 - 0
	// 01 - 1
	// 11 - 3
	// 10 - 2

	// for (int i = 0; i < 1<<n; i++) result.add(i ^ i>>1);  // ^ 异或， 同为0， 异为1

	// 1. i = 0; 0 ^ 0/2 = 0

	// 2. i = 1; 1 ^ 1/2 = 1

	// 3. i = 2; 2 ^ 2/2 = 10 ^ 01 == 11 = 3

	// 4. i = 3; 3 ^ 3/2 = 11 ^ 01 == 10 = 2

	    public List<Integer> grayCode(int n) {
	        List<Integer> result = new LinkedList<>();
	        for (int i = 0; i < 1<<n; i++) result.add(i ^ i>>1);
	        return result;
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
