package soccer;

public class League {

	public static void main(String[] args) {
		String lastName = "Francis Constantino";
		System.out.println(lastName.charAt(8));
		System.out.println(lastName.substring(lastName.indexOf("C")));

		String greet = " HOW ".trim();
		String lc = greet + "DY".toLowerCase();
		System.out.println(lc);

		String lc2 = (greet + "DY").toLowerCase();
		System.out.println(lc2);
	}

}
