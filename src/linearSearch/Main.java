package linearSearch;

public class Main {

	public static void main(String[] args) {
		int[] array = { 5, 6, 7, 8, 91, 2, 3, 4 };
//		int index = LinearSearch(array, 91);
		int index1 = LinearSearch(array, 9);

		if (index1 != -1) {
			System.out.println("Element is found at index: " + index1);
		} else {
			System.out.println("Element is not found");
		}

	}

	private static int LinearSearch(int[] array, int element) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == element) {
				return i;
			}
		}
		return -1;

	}

}
