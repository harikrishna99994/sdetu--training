package datastructures;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Sets {

	public static void main(String[] args) {
		// LinkedHashSet - In order they were entered
		// HashSet - complete random order
		// TreeSet -  rearrange in natural order
		// 1. Define the collection
		Set<String> animals = new LinkedHashSet<String>();

		// 2. Adding elements
		animals.add("dog");
		animals.add("pig");
		animals.add("hog");
		animals.add("cat");
		animals.add("snake");

		System.out.println(animals.size() + " " + animals);

		animals.add("cat");
		animals.add("snake");
		animals.add("goose");

		System.out.println(animals.size() + " " + animals);

		// Create a new set that we use for comparison
		Set<String> farmAnimals = new HashSet<String>();
		farmAnimals.add("chicken");
		farmAnimals.add("cow");
		farmAnimals.add("pig");
		farmAnimals.add("horse");
		farmAnimals.add("dog");

		// what is the INTERSECTION (only animals and farm animals "AND")
		// 1. Copy existing set into a new set
		Set<String> intersectionSet = new HashSet<String>(animals);
		System.out.println(intersectionSet);

		// 2. Retain ONLY the elements that are also in the other set
		intersectionSet.retainAll(farmAnimals);

		System.out.println("The Intersection is: " + intersectionSet);

		// What is the UNION (are both animals and farm animals "OR")
		Set<String> unionSet = new HashSet<String>(farmAnimals);
		unionSet.addAll(animals);
		System.out.println("The union is: " + unionSet);

		// What is the difference(animals but NOT farm animals - in 1 and NOT other)
		Set<String> differenceSet = new HashSet<String>(animals);
		differenceSet.removeAll(farmAnimals);
		System.out.println("The differenceSet is: " + differenceSet);
	}
}
