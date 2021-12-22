package Algorithm;

public class InsertionSort extends Sorting {
	public static void main(String[] args) {
		InsertionSort sort = new InsertionSort();
		int[] a = {-1, 14, 2, 4, 9, 3, -12, 7, 43, 6, 1, 0};
		sort.sorting(a);
		for(int i = 0; i< a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
	
	public void sorting(int[] nums) {
		if(nums.length <= 1) return;
		for(int i = 1; i < nums.length; i++) {
			int key = nums[i];
			int j = i - 1;
			while(j >= 0 && key < nums[j]) {
				nums[j + 1] = nums[j];
				j--;
			}
			nums[j + 1] = key;
		}
	}

}
