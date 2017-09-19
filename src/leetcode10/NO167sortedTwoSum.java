package leetcode10;

//this code assumes that each input would have exactly one solution
//what if there are more than one pair of solution
public class NO167sortedTwoSum {

	public int[] twoSum(int[] numbers, int target) {
        int index1=0, index2=numbers.length-1;
        int[] result=new int[2];
        while(index1<index2){
            if(numbers[index1]+numbers[index2]==target){
            	result[0]=index1+1;
            	result[1]=index2+1;
            	System.out.println(result[0]);
            	System.out.println(result[1]);
            	return result;
            }
            else if(numbers[index1]+numbers[index2]<target){
                index1++;
            }
            else
                index2--;
        }
        System.out.println("no");
        return new int[]{-1,-1};
    }
	
	public static void main(String[] args) {
		
		int[]numbers=new int[]{0,0,0,9}; int target=5;
		NO167sortedTwoSum tester=new NO167sortedTwoSum();
		tester.twoSum(numbers, target);

	}

}
