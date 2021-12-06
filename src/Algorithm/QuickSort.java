package Algorithm;

public class QuickSort {
	public void sorting(int[] arr) {
		quickSort(arr, 0, arr.length - 1);
	}

	private void quickSort(int[] arr, int start, int end) {
//		if(start < end) {
//			int pivot = partition(arr, start, end);
//			quickSort(arr, start, pivot - 1);
//			quickSort(arr, pivot + 1, end);
//		}
		
		while(start < end) {
			int pivot = partition(arr, start, end);
			if((start + end) / 2 > pivot) {
				quickSort(arr, start, pivot - 1);
				start = pivot + 1;
			}
			else {
				quickSort(arr, pivot + 1, end);
				end = pivot - 1;
			}
		}
	}

	private void swap(int[] arr, int a1, int a2) {
		int tmp = arr[a1];
		arr[a1] = arr[a2];
		arr[a2] = tmp;
	}

	private int partition(int[] arr, int front, int end) {
		int pivot = arr[end];
		int boundary = front - 1;
		for (int i = front; i < end; i++) {
			if (arr[i] < pivot) {
				boundary++;
				swap(arr, i, boundary);
			}
		}
		boundary++;
		swap(arr, boundary, end);
		return boundary;
	}
	
	public static void main(String[] args) {
		QuickSort sort = new QuickSort();
		int[] a = {-1, 14, 2, 4, 9, 3, -12, 7, 43, 6, 1, 0};
		sort.sorting(a);
		for(int i = 0; i< a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
}