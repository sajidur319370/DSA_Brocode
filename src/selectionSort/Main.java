package selectionSort;

public class Main {

	public static void main(String[] args) {
		int array[] = { 2, 3, 5, 67, 256, 85, 899, 32, 13, 45, 8 };
		System.out.println("Length of the array is: " + array.length);
		System.out.println("Before sorting array is: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ", ");

		}
		SelectionSort(array);
		System.out.println("\nAfter sorting array is: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ", ");

		}
	}

	private static void SelectionSort(int array[]) {

		for (int j = 0; j < array.length - 1; j++) {
			int min = j;
			for (int i = j + 1; i < array.length; i++) {

				if (array[min] > array[i]) {
					min = i;
				}
			}

			int temp = array[j];
			array[j] = array[min];
			array[min] = temp;

		}
	}

}
