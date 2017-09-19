package binarySearchEasy;

public class No374GuessNumberHigherorLower {

	public int guessNumber(int n) {
        int left = 1, right = n;
        while(left <= right){
            int mid = left +(right-left)/2;
            if(guess(mid)==0){
                return mid;
            }
            else if (guess(mid)==1){   // "my number" is higher means: the number computer picked is higher than what user 
            							//guessed. So relatively, user's number is lower, left should be mid+1;
                left = mid +1;
            }
            else if (guess(mid)==-1){
                right = mid -1;
            }
        }
            return left;
    }
	
	private int guess(int mid) {
		/* The guess API is defined in the parent class GuessGame.
		   @param num, your guess
		   @return -1 if my number is lower, 1 if my number is higher, otherwise return 0
		      int guess(int num); */
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
