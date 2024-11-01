package quickSort;

public class Main {

	public static void main(String[] args) {
		int array[] = { 2, 3, 5, 67, 256, 85, 899, 32, 13, 45, 8 };
		System.out.println("Length of the array is: " + array.length);
		System.out.println("Before sorting array is: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ",");

		}
		QuickSort(array, 0, array.length - 1);
		System.out.println("\nAfter sorting array is: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ",");

		}
	}

	private static void QuickSort(int array[], int begin, int end) {
		if (end <= begin) {

			return; // Base Case
		}
		int pivot = Partition(array, begin, end);
		QuickSort(array, begin, pivot - 1);
		QuickSort(array, pivot + 1, end);

	}

	private static int Partition(int[] array, int begin, int end) {
		int pivot = array[end];
		int i = begin - 1;
		for (int j = begin; j <= end - 1; j++) {
			if (array[j] < pivot) {

				i++;
				int temp = array[j];
				array[j] = array[i];
				array[i] = temp;
			}
		}
		i++;
		int temp = array[i];
		array[i] = array[end];
		array[end] = temp;

		return i;

	}

}
