package beans;

public class Employee {
	private int id;  
	private String firstName,lastName;
	private Seeker seeker;
	public Seeker getSeeker() {
		return seeker;
	}
	public void setSeeker(Seeker seeker) {
		this.seeker = seeker;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}  
	
	
	
}
