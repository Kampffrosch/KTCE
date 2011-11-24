package at.jku.ce;

import java.util.Comparator;

public class DomainObjectComparator implements Comparator<DomainObject>{
	
	public int compare(DomainObject ol, DomainObject o2) {
		return ol.getName().compareTo(o2.getName());
	}
}
