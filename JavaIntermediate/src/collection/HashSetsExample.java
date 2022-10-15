package collection;

import java.util.HashSet;
import java.util.Set;

public class HashSetsExample {
	public static void main(String[] args) {

		Set<String> hashSet = new HashSet<>();
		hashSet.add("B");
		hashSet.add("C");
		hashSet.add("A");
		hashSet.add("E");
		hashSet.add("D");
		hashSet.add("F");
		hashSet.add("F"); // this will overwrite the previous "F", as duplicate values are not permitted
		// System.out.println(hashSet);

//We can check whether a HashSet is empty or not by using isEmpty():
		System.out.println(hashSet.isEmpty());

//We can also use size(), just like with other collection types:
		if (hashSet.size() == 0) {
			System.out.println("HashSet is empty");
		} else {

			System.out.println(hashSet.size());
		}
		hashSet.remove("A");

//hashSet.clear();
		{
		}  System.out.println(hashSet.contains("B")); // returns true

	}
}
