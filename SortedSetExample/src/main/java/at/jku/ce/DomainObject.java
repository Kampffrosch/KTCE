package at.jku.ce;

public class DomainObject implements Comparable<DomainObject> {


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
	
	public void setComment(String comment) {
		this.comment = comment;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String pname) {
		this.name = pname;
	}

	public String toString() {
		return "DomainObject [name=" + name + ", comment=" + comment + ", uuid=" + uuid + "]";
	}
	
	public boolean equals(Object obj) { 
		if (!(obj instanceof DomainObject)) { 
			return false; 
		} 
		DomainObject domainObj = (DomainObject) obj; 
		return uuid.equals(domainObj.getUuid()); 
	}
	
	public int hashCode(){
		if (uuid != null){
			return uuid.hashCode();
		} else {
			return super.hashCode();
		}
	}
	
	public int compareTo(DomainObject o) { 
		DomainObject domainObj = (DomainObject) o;
		int domObjeComp = name.compareTo(domainObj.getName()); 
		return ((domObjeComp == 0) ? uuid.compareTo(domainObj.getUuid()) : domObjeComp); 
	}
}
