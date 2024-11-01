package mergSort;

public class Main {

	public static void main(String[] args) {
		int array[] = { 2, 256, 3, 5, 67, 85, 8, 99, 32, 13, 45, };
		System.out.println("Length of the array is: " + array.length);
		System.out.println("Before sorting array is: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ", ");

		}
		MergeSort(array);
		System.out.println("\nAfter sorting array is of: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ", ");

		}
	}

	private static void MergeSort(int[] array) {
		int length = array.length;

		if (length <= 1) {
			return;
		}

		int mid = length / 2;
		System.out.println("\nMid: " + mid);
		int[] left_array = new int[mid];
		int[] right_array = new int[length - mid];

		int i = 0;// for left_array
		int j = 0;// for_right_array

		for (; i < length; i++) {
			if (i < mid) {

				left_array[i] = array[i];

			} else {

				right_array[j] = array[i];
				j++;

			}
		}

		MergeSort(left_array);
		MergeSort(right_array);
		System.out.println("\nBack to Back");
		Merge(left_array, right_array, array);
		System.out.println("Le le le");

	}

	private static void Merge(int[] left_array, int[] right_array, int[] array) {
		System.out.println("hus hus hus");

		int left_size = array.length / 2;
		int right_size = array.length - left_size;

		int l = 0;// for left_array
		int r = 0;// for_right_array
		int i = 0;// for_main_array

		while (l < left_size && r < right_size) {
			if (left_array[l] < right_array[r]) {

				array[i] = left_array[l];
				l++;
				i++;
			} else {
				array[i] = right_array[r];
				r++;
				i++;
			}
		}
		while (l < left_size) {

			array[i] = left_array[l];
			l++;
			i++;

		}
		while (r < right_size) {
			array[i] = right_array[r];
			r++;
			i++;

		}

	}

}