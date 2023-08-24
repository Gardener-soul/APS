package pq03;

import java.util.Comparator;

public class NameComparator implements Comparator<Person> {

	public static void main(String[] args) {
		
	}

	@Override
	public int compare(Person o1, Person o2) {
		return o2.name.compareTo(o1.name);
	}
	
}
