package beans;

public class Seeker extends Employee{
	private int seekerId;
	public int getSeekerId() {
		return seekerId;
	}
	public void setSeekerId(int seekerId) {
		this.seekerId = seekerId;
	}
	private int noOfChild;;
	private String spouseName;
	private Employee emp;
	public Employee getEmp() {
		return emp;
	}
	public void setEmp(Employee emp) {
		this.emp = emp;
	}
	public int getNoOfChild() {
		return noOfChild;
	}
	public void setNoOfChild(int noOfChild) {
		this.noOfChild = noOfChild;
	}
	public String getSpouseName() {
		return spouseName;
	}
	public void setSpouseName(String spouseName) {
		this.spouseName = spouseName;
	}

}
