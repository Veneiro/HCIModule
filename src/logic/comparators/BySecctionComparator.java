package logic.comparators;

import java.util.Comparator;

import logic.Gift;

public class BySecctionComparator implements Comparator<Gift>{

	@Override
	public int compare(Gift o1, Gift o2) {
		int value1 = o1.getSection().compareTo(o2.getSection());
		return value1;
	}

}
