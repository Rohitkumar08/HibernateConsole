package beans;

public class Sitter extends Employee {
	private int noOfExp;
	public int getNoOfExp() {
		return noOfExp;
	}
	public void setNoOfExp(int noOfExp) {
		this.noOfExp = noOfExp;
	}
	public int getPayPerHour() {
		return payPerHour;
	}
	public void setPayPerHour(int payPerHour) {
		this.payPerHour = payPerHour;
	}
	private int payPerHour;

}
