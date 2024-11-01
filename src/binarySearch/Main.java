/*
 *Search from sorted array
 *************************/
package binarySearch;

public class Main {

	public static void main(String[] args) {
		int array[] = new int[100000];
		for (int i = 0; i < array.length; i++) {
			array[i] = i;
		}

		int index = BinarySearch(array, 77777);
		if (index != -1) {
			System.out.println("Element is found at index: " + index);
		} else {
			System.out.println("Element is not found");
		}

	}

	private static int BinarySearch(int[] array, int element) {
		int low_index = 0;
		int high_index = array.length - 1;

		while (low_index <= high_index) {
			int mid_index = low_index + (high_index - low_index) / 2;
			System.out.println("Mid index is:" + mid_index);
			int mid_value = array[mid_index];
			if (element < mid_value) {
				high_index = mid_index - 1;
			} else if (element > array[mid_index]) {
				low_index = mid_index + 1;
			} else {
				return mid_index;
			}
		}

		return -1;
	}

}
