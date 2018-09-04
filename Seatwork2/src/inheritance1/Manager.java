package inheritance1;

public class Manager extends Employee {
	private int numberOfReportees;
	
	public void printDetails() {
		super.printDetails();
		System.out.println("number of reportees: " + numberOfReportees);
	}

	public int getNumberOfReportees() {
		return numberOfReportees;
	}

	public void setNumberOfReportees(int numberOfReportees) {
		this.numberOfReportees = numberOfReportees;
	}
}
