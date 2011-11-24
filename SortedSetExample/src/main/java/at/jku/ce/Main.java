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
		Set<DomainObject> objectSet = new HashSet<DomainObject>();
		Set<DomainObject> objectSet = new TreeSet<DomainObject>(new DomainObjectComparator());
		objectSet.add(DomainFactory.createDomainObject("Helga","asdf"));
		objectSet.add(DomainFactory.createDomainObject("Walter","asdf"));
		objectSet.add(DomainFactory.createDomainObject("Hans","asdf"));
		objectSet.add(DomainFactory.createDomainObject("Paula","asdf"));
		objectSet.add(DomainFactory.createDomainObject("Claudia","asdf"));
		for (DomainObject domainObject : objectSet) {
			LOGGER.debug(domainObject.getUuid());
			LOGGER.debug(domainObject.toString());
		}
	}

}