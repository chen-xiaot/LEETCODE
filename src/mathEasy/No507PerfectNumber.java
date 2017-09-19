package mathEasy;

public class No507PerfectNumber {

public boolean checkPerfectNumber(int num) {
        
        int sum=1;
        
        for(int i=2; i<=Math.sqrt(num); i++){
            if(num % i == 0){
                sum += i+num/i;
            }
        }
        
        if (sum!=1 && (sum == num)) return true;
        else return false;
        
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
