package mathEasy;

public class No69Sqrtx {

	public int mySqrt(int x) {
        if(x<1) return 0;

        long left =0, right =x, ans=0;
        while(left<=right){
            long mid = left + (right-left)/2;
            if(mid*mid == x){
                return (int)mid;
            }
            else if(mid*mid < x){
                left = mid +1;
                ans = mid;
            }
            else if(mid*mid>x){
                right = mid-1;
            }
        }
        return (int)ans;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
