package at.jku.ce;

import java.util.Set;
import java.util.TreeSet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

	private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Set<DomainObject> objectSet = new TreeSet<DomainObject>(new DomainObjectComparator());
		objectSet.add(new DomainObject("Helga","asdf"));
		objectSet.add(new DomainObject("Walter","asdf"));
		objectSet.add(new DomainObject("Hans","asdf"));
		objectSet.add(new DomainObject("Paula","asdf"));
		objectSet.add(new DomainObject("Claudia","asdf"));
		for (DomainObject domainObject : objectSet) {
			LOGGER.debug(domainObject.toString());
		}
	}

}
