package mathEasy;

public class No441ArrangingCoins {

	public int arrangeCoins(int n) {
        int res=0;
        res = (int) ((-1 + Math.sqrt(1+8*(long)n))/2);
        return res;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
