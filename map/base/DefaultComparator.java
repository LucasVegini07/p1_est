package map.base;

import java.util.Comparator;

public class DefaultComparator<E extends Comparable<E>> implements Comparator<E> {
	
	public int compare(E a, E b) {
		return a.compareTo(b);
	}
	
}
