package at.jku.ce;

public class Main {

	private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Set<DomainObject> objectSet = new HashSet<DomainObject>();
		objectSet.add(new DomainObject("Helga","asdf"));
		objectSet.add(new DomainObject("Walter","asdf"));
		objectSet.add(new DomainObject("Hans","asdf"));
		objectSet.add(new DomainObject("Paula","asdf"));
		objectSet.add(new DomainObject("Claudia","asdf"));
		for (DomainObject domainObject : objectSet) {
			LOGGER.debug(domainObject.getUuid());
		}
	}

}
