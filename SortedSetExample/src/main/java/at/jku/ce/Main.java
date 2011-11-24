package at.jku.ce;

public class Main {

	private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Set<DomainObject> objectSet = new HashSet<DomainObject>();
		objectSet.add(DomainFactory.createDomainObject("Helga","asdf"));
		objectSet.add(DomainFactory.createDomainObject("Walter","asdf"));
		objectSet.add(DomainFactory.createDomainObject("Hans","asdf"));
		objectSet.add(DomainFactory.createDomainObject("Paula","asdf"));
		objectSet.add(DomainFactory.createDomainObject("Claudia","asdf"));
		for (DomainObject domainObject : objectSet) {
			LOGGER.debug(domainObject.getUuid());
		}
	}

}
