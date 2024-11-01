/*
 *Search from sorted array
 *************************/
package interpolationSearch;

public class Main {

	public static void main(String[] args) {

		int[] array = { 1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024 };
		int index = InterpolationSearch(array, 512);
		if (index != -1) {
			System.out.println("Element is found at index: " + index);
		} else {
			System.out.println("Element is not found");
		}

	}

	private static int InterpolationSearch(int[] array, int element) {
		int low_index = 0;
		int high_index = array.length - 1;

		while (element >= array[low_index] && element <= array[high_index] && low_index <= high_index) {
			int prob = low_index
					+ (high_index - low_index) * (element - array[low_index]) / (array[high_index] - array[low_index]);
			System.out.println("Prob index is:" + prob);

			if (element < array[prob]) {
				high_index = prob - 1;
			} else if (element > array[prob]) {
				low_index = prob + 1;
			} else {
				return prob;
			}
		}
		return -1;
	}
}
