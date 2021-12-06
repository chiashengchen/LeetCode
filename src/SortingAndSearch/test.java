package SortingAndSearch;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import Algorithm.QuickSort;

public class test {
	public static void main(String[] args) {
		test test1 = new test();
		QuickSort qs = new QuickSort();
		int[] a = { 1, 1, 1, 2, 2, 3, 3, 3, 3, 3, 4 };
		int[] c = { 5, 6, 34, 13, 2, 3, 7, 12, 11, 1, 4 };
		int k = 2;
		int[] b = new int[k];
//		b = test1.topKFrequent(a, k);
//		for(int i = 0; i < b.length; i++) {
//			System.out.println(b[i]);
//		}
		qs.sorting(c);
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}
	}

	public int[] topKFrequent(int[] nums, int k) {
		// O(1) time
		if (k == nums.length) {
			return nums;
		}

		// 1. build hash map : character and how often it appears
		// O(N) time
		Map<Integer, Integer> count = new HashMap();
		for (int n : nums) {
			count.put(n, count.getOrDefault(n, 0) + 1);
		}

		// init heap 'the less frequent element first'
		Queue<Integer> heap = new PriorityQueue<>((n1, n2) -> count.get(n1) - count.get(n2));

		// 2. keep k top frequent elements in the heap
		// O(N log k) < O(N log N) time
		for (int n : count.keySet()) {
			heap.add(n);
			if (heap.size() > k)
				heap.poll();
		}

		// 3. build an output array
		// O(k log k) time
		int[] top = new int[k];
		for (int i = k - 1; i >= 0; --i) {
			top[i] = heap.poll();
		}
		return top;
	}
}
