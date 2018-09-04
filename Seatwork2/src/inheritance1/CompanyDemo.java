package inheritance1;

public class CompanyDemo {

	public static void main(String[] args) {
		Manager manager = new Manager();
		manager.setId(2);
		manager.setEname("francis");
		manager.setEmail("francis@mail.com");
		manager.setVacationDays(2);
		manager.setNumberOfReportees(3);
		manager.printDetails();

	}

}
