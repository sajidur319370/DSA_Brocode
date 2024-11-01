package bubbleSort;

public class Main {

	public static void main(String[] args) {
		int array[] = { 2, 3, 5, 67, 256, 85, 899, 32, 13, 45, 8 };
		System.out.println("Length of the array is: " + array.length);
		System.out.println("Before sorting array is: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ",");

		}
		BubbleSort(array);
		System.out.println("\nAfter sorting array is: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ",");

		}
	}

	private static void BubbleSort(int array[]) {
		int temp;
		for (int j = 0; j < array.length - 1; j++) {
			for (int i = 0; i < array.length - j - 1; i++) {
				if (array[i] > array[i + 1]) {
					temp = array[i];
					array[i] = array[i + 1];
					array[i + 1] = temp;
				}
			}

		}
	}

}
