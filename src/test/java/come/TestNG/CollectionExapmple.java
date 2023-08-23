package come.TestNG;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.LinkedList;
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class CollectionExapmple {

	public static void main(String[] args) {
//		String[] name = new String[3];
//		name[0]= "this";
//	error-	ArrayList<String> name = new ArrayList<String>();
		String[] names = new String[4]; // array

		List<String> name = new ArrayList<>();

		name.add("Chir");
		name.add("Peter");
		name.add("John");
		name.add("Sams");
		System.out.println(name);
		name.add("Holland");
		name.remove(1);
		System.out.println(name.size());
		for (String str : name) {
			System.out.println(str);
		}
		// vector double capacity every run out time.
		Vector<Integer> v = new Vector<Integer>();
		v.add(4);
		v.add(6);
		v.add(8);
		v.add(40);
		v.add(61);
		v.add(84);
		v.add(4);
		v.add(66);
		v.add(86);
		v.add(43);
		v.add(62);
		v.add(89);
		System.out.println(v.capacity());
		v.remove(4);
		for (int i : v) {
			System.out.println(i);
		}
		LinkedList<String> name1 = new LinkedList<>();
		name1.add("John");
		name1.add("Peter");
		name1.add("Rosan");
		name1.add("Sam");
		name1.add("Keth");
		name1.add("Josh");
		name1.remove(3);
		System.out.println(name1.get(2));
		System.out.println(name1);
		for (String i : name1) {
			System.out.println(name1);
		}
		Set<String> set = new HashSet<>();
		set.add("Hello");
		set.add("world");
		set.add("hi");
		set.add("Good");
		Iterator<String> it = set.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		LinkedHashSet<String> linkedHashet = new LinkedHashSet<>();
		//it maintains insertion order
		linkedHashet.add("Dear");
		linkedHashet.add("Love");
		linkedHashet.add("Wellcome");
		linkedHashet.add("Thank You");
		for (String i : linkedHashet) {
			System.out.println(linkedHashet);
			
		}
		TreeSet<String> treeSet = new TreeSet<>();
		//it maintains ascending order
		treeSet.add("Dear");
		treeSet.add("Love");
		treeSet.add("Wellcome");
		treeSet.add("Thank You");
		for (String i : treeSet) {
			System.out.println(treeSet);
	}
	}
}
