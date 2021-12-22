package Algorithm;

public class BubbleSort extends Sorting {
	public static void main(String[] args) {
		BubbleSort sort = new BubbleSort();
//		int[] a = {-1, 14, 2, 4, 9, 3, -12, 7, 43, 6, 1, 0};
		int[] a = {-1, 34, 2, 3, 4, 5, 15, 30};
		sort.sorting(a);
		for(int i = 0; i< a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
	
	public void sorting(int[] nums) {
		if(nums.length <= 1) return;
        boolean swapped;
		for(int i = nums.length; i >= 0; i--) {
            swapped = false;
			for(int j = 0; j < i - 1; j++) {
				if(nums[j] > nums[j + 1]) {
                    swapped = true;
					int tmp = nums[j];
					nums[j] = nums[j + 1];
					nums[j + 1] = tmp;
				} 
			}
            if(!swapped) break;
		}
	}

	@Override
	public void printArray(int[] a) {
		// TODO Auto-generated method stub
		
	}
}