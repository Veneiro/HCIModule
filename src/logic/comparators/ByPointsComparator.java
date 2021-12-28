package logic.comparators;

import java.util.Comparator;

import logic.Gift;

public class ByPointsComparator implements Comparator<Gift> {

	@Override
	public int compare(Gift o1, Gift o2) {
		int value1 = o1.getPoints().compareTo(o2.getPoints());
		return value1;
	}

}
