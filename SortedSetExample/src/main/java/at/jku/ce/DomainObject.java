package at.jku.ce;

public class DomainObject {


	private String uuid = UUID.randomUUID().toString()
	private String name;
	private String comment;

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
	
	public String getComment() {
		return comment;
	}
	
	public void setComment(final String comment) {
		this.comment = comment;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(final String pname) {
		this.name = pname;
	}

}
