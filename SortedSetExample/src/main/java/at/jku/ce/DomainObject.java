package at.jku.ce;

public class DomainObject {


	private String uuid = UUID.randomUUID().toString()
	private String name;

	public DomainObject(String id) {
		super();
		this.uuid = id;
	}

	/**
	 * Default constructor
	 */
	public DomainObject(String name, String comment) {
		super();
	}

	public String getUuid() {
		return uuid;
	}

}
