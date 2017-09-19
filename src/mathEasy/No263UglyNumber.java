package mathEasy;

public class No263UglyNumber {

	public boolean isUgly(int num) {
        if (num < 1) return false;
        if (num == 1) return true;
        while(num%2==0) num=num/2;
        while(num%3==0) num=num/3;
        while(num%5==0) num=num/5;
        return num==1;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
