package Algorithm;


public class HeapSort extends Sorting {
	// 由小到大 -> MaxHeap
	@Override
	public void sorting(int[] arr) {
		// TODO Auto-generated method stub
		
		int length = arr.length;
		BuildMaxHeap(arr);
		length--;
		printArray(arr);
		while(length >= 1) {
			swap(arr, 0, length);
			MaxHeapify(arr, 0, length);
			length--;
		}
	}
	
	private void BuildMaxHeap(int[] arr) {
		int start = arr.length / 2 - 1;
		for(; start >= 0; start--) {
			MaxHeapify(arr, start, arr.length);
		}
	}
	
	private void MaxHeapify(int[] arr, int root, int length) {
//		int l = (start + 1) * 2 - 1;
//		int r = (start + 1) * 2 - 1 + 1;
		int l = root * 2 + 1;
		int r = root * 2 + 2;
		int largest = 0;
		if(l >= length) return;
		if(r >= length) 
			largest = l;
		else
			largest = arr[l] > arr[r] ? l : r;
		if(arr[root] < arr[largest]) {
			swap(arr, root, largest);
			MaxHeapify(arr, largest, length);
		}
	}
	
	private void swap(int[] arr, int a, int b) {
		int tmp = arr[a];
		arr[a] = arr[b];
		arr[b] = tmp;
	}
	
	public static void main(String[] arg) {
		Sorting sort = new HeapSort();
		int[] a = {-1, 34, 2, 3, 4, 5, 15, 30};
		sort.sorting(a);
		sort.printArray(a);
	}
	
}
