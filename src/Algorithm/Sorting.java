package Algorithm;

abstract class Sorting {
	abstract void sorting(int[] arr);

	public void printArray(int[] arr) {
		for(int i = 0; i< arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.print('\n');
	}
}
