package Sort;

public class No274HIndex {

	public int hIndex(int[] citations) {
        int len = citations.length;
        int[] count = new int[len + 1];
        for (int n : citations) {
            if (n > len) {
                count[len]++;
            } else {
                count[n]++;
            }
        }
        
        int total = 0;
        for (int i = len; i >= 0; i--) {
            total += count[i];
            if (total >= i) {
                return i;
            }
        }
        return 0; 
    }
	
//	citations = [3, 0, 6, 1, 5]
//
//			count =     [1, 1, 0, 1, 0, 2]
//
//			length = 5
//
//			1. c = 3, count[c]++
//			2. c = 0, count[0]++
//			3. c = 6, count[5]++
//			4. c = 1, count[1]++
//			5. c = 5, count[5]++
//
//			1. i = 5, total = 2
//			2. i = 4, total = 2
//			3. i = 3, total = 3, return i = 3;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
