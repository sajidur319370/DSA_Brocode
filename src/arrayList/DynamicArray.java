package arrayList;

public class DynamicArray {
	int size;
	int capacity = 10;
	Object[] array;

	public DynamicArray() {
		this.array = new Object[capacity];
	}

	public DynamicArray(int capacity) {
		this.capacity = capacity;
		this.array = new Object[capacity];
	}

	public void add(Object data) {
		if (size >= capacity) {
			grow();
		}
		array[size] = data;
		size++;

	}

	public void insert(int index, Object data) {
		if (size >= capacity) {
			grow();
		}
		for (int j = size; j >= index; j--) {
			array[j] = array[j - 1];
		}
		array[index] = data;
		size++;

	}

	public void delete(Object data) {
		for (int j = 0; j < size; j++) {

			if (array[j] == data) {
				for (int i = 0; i < (size - j - 1); i++) {

					array[j + i] = array[j + i + 1];
				}
				array[size - 1] = null;
				size--;
				if (size <= (int) (capacity / 3)) {
					shrink();

				}
				break;

			}

		}

	}

	public int search(Object data) {
		for (int j = 0; j < size; j++) {

			if (array[j] == data) {

				return j;

			}
		}
		return -1;

	}

	public String toString() {
		String s = "";
		for (int i = 0; i < size; i++) {
			s += array[i] + " , ";
		}
		if (s != "") {
			s = "[" + s.substring(0, s.length() - 2) + "]";
		} else {
			s = "[]";
		}
		return s;
	}

	private void grow() {
		int newCapacity = (int) (capacity * 2);
		Object[] newArray = new Object[newCapacity];
		for (int i = 0; i < size; i++) {
			newArray[i] = array[i];
		}
		capacity = newCapacity;
		array = newArray;

	}

	private void shrink() {
		int newCapacity = (int) (capacity / 2);
		Object[] newArray = new Object[newCapacity];
		for (int i = 0; i < size; i++) {
			newArray[i] = array[i];
		}
		capacity = newCapacity;
		array = newArray;

	}

	public boolean isEmpty() {
		return size == 0;

	}

}
