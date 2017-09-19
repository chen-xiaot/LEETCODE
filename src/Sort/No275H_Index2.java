package Sort;

public class No275H_Index2 {

	public int hIndex(int[] citations) {
        int left = 0, len = citations.length, right = len - 1, mid = 0;
        while (left <= right) {
            mid = left + (right - left) / 2;
            if (citations[mid] == (len - mid)) return citations[mid];
            else if (citations[mid] > (len - mid)) right = mid - 1;
            else left = mid + 1;
        }
        return len - (right + 1);
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
