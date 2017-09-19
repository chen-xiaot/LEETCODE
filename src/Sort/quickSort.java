package Sort;

import java.util.Random;

public class quickSort {

	public void sort(int[] nums, int left, int right) {
		if (left < right) {
			int partition = partitionFct(nums, left, right);
			sort(nums, left, partition - 1);
			sort(nums, partition + 1, right);
		}

	}
	private static int partitionFct(int[] nums, int left, int right) {
		int pivot = nums[right];
		int i = left - 1;
		for (int j = left; j < right; j++) {
			if (nums[j] < pivot) {
				i++;
				swap(nums, i, j);
			}
		}
		swap(nums, i + 1, right);
		return i + 1;
	}
	
	
	private static void swap(int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}
	
	
	
	
	
	public void sort2 (int[] nums, int left, int right) {
		if (left < right) {
			int partition = partitionFct2(nums, left, right);
			sort2(nums, left, partition - 1);
			sort2(nums, partition + 1, right);
		}
	}
	
	private int partitionFct2(int[] nums, int left, int right) {
		int pivot = nums[left];
		int i = left;
		int j = right;
		while (i < j) {
			while (i <= right && nums[i] <= pivot) i++;
			while (j >= left && nums[j] > pivot) j--;
			if (i < j) {
				swap(nums, i, j);
			}
		}
		swap(nums, left, j);
		return j;
	}
	
	
	
	public void sort3 (int[] nums, int left, int right) {
		if (left < right) {
			int partition = partitionFct3(nums, left, right);
			sort2(nums, left, partition);
			sort2(nums, partition + 1, right);
		}
	}
	private int partitionFct3(int[] nums, int left, int right) {
		int pivot = nums[left];
		int i = left;
		int j = right + 1;
		while (i < j) {
			while (i < right && nums[++i] < pivot);
			while (j > left && nums[--j] > pivot);
			if (i < j) {
				swap(nums, i, j);
			}
		}
		swap(nums, left, j);
		return j;
	}
	
	private void shuffle(int[] nums) {
		Random random = new Random();
		for (int i = 0; i < nums.length; i++) {
			int ran = random.nextInt(nums.length);
			swap(nums, i, ran);
		}
	}
	
	public static void main(String[] args) {
		quickSort test = new quickSort();
		int[] nums = {1, 9, 6, 7, 8, 5, 4, 2, 3};
		int[] nums1 = {0,1,0,2,0};
		int[] nums2 = {5, 4, 3, 2, 1};
		test.sort3(nums1, 0, nums1.length - 1);
		for (int n : nums1) {
			System.out.print(n);
		}
		System.out.println();
		test.shuffle(nums2);
		
		for (int n : nums2) {
			System.out.print(n);
		}

	}

}
