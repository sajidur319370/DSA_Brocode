package hashTable;

import java.util.Hashtable;

public class Main {

	public static void main(String[] args) {

		Hashtable<String, String> table = new Hashtable<>(10);

		table.put("139", "Abdur");
		table.put("124", "Rakib");
		table.put("555", "Mostafa");
		table.put("268", "Kamal");
		table.put("272", "Rasael");
		table.put("453", "Ahmed");
		table.put("668", "Wasif");
		table.put("856", "Reza");

		for (String key : table.keySet()) {

			System.out.println(key.hashCode() + "\t" + key + "\t" + table.get(key));
		}

	}

}
