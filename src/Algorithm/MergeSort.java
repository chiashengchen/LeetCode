package Algorithm;

public class MergeSort extends Sorting {
	public void sorting(int[] nums) {
		mergeSort(nums, nums.length);
	}

	private void mergeSort(int[] nums, int n) {
		if (n < 2)
			return;
		int mid = n / 2;
		int[] l = new int[mid];
		int[] r = new int[n - mid];
		for (int i = 0; i < mid; i++)
			l[i] = nums[i];
		for (int i = mid; i < n; i++)
			r[i - mid] = nums[i];
		mergeSort(l, mid);
		mergeSort(r, n - mid);
		merge(nums, l, r, mid, n - mid);
	}

	private void merge(int[] nums, int[] l, int[] r, int l_size, int r_size) {
		l_size -= 1;
		r_size -= 1;
		int pointer = nums.length - 1;
		while (l_size >= 0 && r_size >= 0) {
			if (l[l_size] > r[r_size])
				nums[pointer--] = l[l_size--];
			else
				nums[pointer--] = r[r_size--];
		}

		while (l_size >= 0) {
			nums[pointer--] = l[l_size--];
		}

		while (r_size >= 0) {
			nums[pointer--] = r[r_size--];
		}
	}

	public static void main(String[] args) {
		MergeSort sort = new MergeSort();
		int[] a = { -1, 14, 2, 4, 9, 3, -12, 7, 43, 6, 1, 0 };
		sort.sorting(a);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

	@Override
	public void printArray(int[] a) {
		// TODO Auto-generated method stub
		
	}
}
