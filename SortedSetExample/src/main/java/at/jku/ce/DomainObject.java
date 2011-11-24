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
	public DomainObject() {
		super();
	}

	public String getUuid() {
		return uuid;
	}
	
	public String getComment() {
		return comment;
	}
	
	public void setComment(String comment) {
		this.comment = comment;
	}

}
