package arrayList;

public class Main {

	public static void main(String[] args) {

		DynamicArray d_array = new DynamicArray(5);
		d_array.add("Mostofa");
		d_array.add("Kamal");
		d_array.add("Habu");
		d_array.add("Jada");
//		d_array.add("Rasel");
//		d_array.add("Nasid");
//		d_array.delete("Jada");
//		d_array.delete("Habu");

		System.out.println(d_array);
		System.out.println("Size:" + d_array.size);
		System.out.println("Capacity:" + d_array.capacity);

	}

}
