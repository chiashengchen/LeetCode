package Array;

import java.util.Arrays;

public class test {
	public static void main(String[] args) {
		test test1 = new test();
		int[] a = {-1, 14, 2, 4, 9};
		System.out.println(test1.subarray_sum_equal_to_k(a, 7));
	}
	
	public boolean subarray_sum_equal_to_k(int[] nums, int k) {
		Arrays.sort(nums);
		int sum[] = new int[nums.length];
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] == k) return true;
			sum[i] = nums[i];
			for(int j = 0; j < i; j++) {
				sum[j] += nums[i];
				if(sum[j] == k) return true;
			}
		}
		return false;
	}
}
