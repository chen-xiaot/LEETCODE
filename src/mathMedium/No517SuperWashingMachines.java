package mathMedium;

public class No517SuperWashingMachines {

	public int findMinMoves(int[] machines) {
        int total = 0;
        for (int n : machines) {
            total += n;
        }
        if (total % machines.length != 0) return -1;
        int avg = total / machines.length;
        int count = 0, max = 0;
        for (int load : machines) {
            count += load - avg;
            max = Math.max(max, Math.max(Math.abs(count), load - avg));
        }
        return max;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
