package structures;

import java.util.TreeSet;

public class TreeSetStructure {
	public static void main(String[] args) {
		TreeSet<Integer> treeSet = new TreeSet<>();
		treeSet.add(5);
		treeSet.add(6);
		treeSet.add(7);
		treeSet.add(8);
		treeSet.add(9);
		treeSet.add(10);

		System.out.println(treeSet);

		// First
		System.out.println(treeSet.first()); // 5

		// Last
		System.out.println(treeSet.last()); // 5

		// Higher
		System.out.println(treeSet.higher(7)); // 8
		// Lower
		System.out.println(treeSet.lower(7)); // 6

		// Ceiling
		System.out.println(treeSet.ceiling(7)); // 7

		// Floor
		System.out.println(treeSet.floor(7)); // 7
	}
}
