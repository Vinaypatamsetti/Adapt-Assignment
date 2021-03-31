package assign3;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Assignment3Q2 {

	public static void main(String[] args) {
		HashSet <String> hashSet=new  HashSet<>();
		     hashSet.add("Vinay");
		     hashSet.add("Rahul");
			 hashSet.add("Arjun");
		LinkedHashSet <String>linkedHashSet=new LinkedHashSet<>();
			linkedHashSet.add("Vinay");
			linkedHashSet.add("Rahul");
			linkedHashSet.add("Arjun");
			System.out.println("Hashset:");
			for(String p:hashSet) {
				System.out.println(p);
			}
			System.out.println(" ");
			System.out.println("LinkedHashSet:");
			for(String q: linkedHashSet) {
				System.out.println(q);
			}
			
	}

}
