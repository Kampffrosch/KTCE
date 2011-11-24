package at.jku.ce;

public class DomainObject {

	public String uuid = UUID.randomUUID().toString()
	private String name;

	public DomainObject(String id) {
		super();
		this.uuid = id;
	}

	/**
	 * Default constructor
	 */
	public DomainObject() {
		super();
	}

	public String getUuid() {
		return uuid;
	}

}
