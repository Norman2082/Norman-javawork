package collection;

import java.util.Map.Entry;
import java.util.HashMap;
import java.util.Map;

public class Runner {
	public static void main(String[] args) {
		Map<String, String> capitalCities = new HashMap<>();

		capitalCities.put("England", "London");
		capitalCities.put("Russia", "Moscow");
		capitalCities.put("Japan", "Tokyo");
	

	System.out.println(capitalCities.get("Russia"));// This returns the key for the "Russia" value, which is "Moscow"
		{
//			System.out.println(capitalCities.remove("England"));// methods, like remove(), clear() and size(),
//			capitalCities.clear(); // all work in the same way that they do for other collection types
//			capitalCities.size();
//		}
//		for (String i : capitalCities.keySet()) { // We can loop through the keys (on the left side) using keySet()
//			System.out.println(i);
//		}
//
//		for (String i : capitalCities.values()) { // We can loop through the values (on the right side) using values()
//			System.out.println(i);
//		}
//
//		for (Entry<String, String> i : capitalCities.entrySet()) { // You'll need to iterate through an Entry collection
//			System.out.println(i); // through the entire entry (both sides) using entrySet()
		}
		/********************************************************************************************************************/
	}
	

	Map<String, Integer> people = new HashMap<>(); // defined HashMap object called people that maps names to ages:
	{
		people.put("Nick", 25);
		people.put("Jordan", 26);
		people.put("John", 33);
		System.out.println(people);
	}
	{
		for (Entry<String, Integer> i : people.entrySet()) {
			System.out.println(i);

			{
			}
		}
	}
}
