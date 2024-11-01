package insertionSort;

public class Main {

	public static void main(String[] args) {
		int array[] = { 2, 256, 3, 5, 67, 85, 8, 99, 32, 13, 45, };
		System.out.println("Length of the array is: " + array.length);
		System.out.println("Before sorting array is: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ", ");

		}
		InsertionSort(array);
		System.out.println("\nAfter sorting array is of: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ", ");

		}
	}

	private static void InsertionSort(int array[]) {

		for (int j = 1; j < array.length; j++) {
			int temp = array[j];
			int i = j - 1;
			while (i >= 0 && array[i] > temp) {
				array[i + 1] = array[i];
				i--;
			}
			array[i + 1] = temp;
		}
	}

}