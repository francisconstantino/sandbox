package shoppingcart;

public class Shoppingcart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String custName = "Sally Smith";
		String firstName;
		String lastName;
		int spaceIndex;
		StringBuilder sb;

		//Get the index of the space character
		spaceIndex = custName.indexOf(" ");
		System.out.println(spaceIndex);

		//Use substring method to locate first name
		firstName = custName.substring(0, spaceIndex);
		lastName = custName.substring(spaceIndex + 1);
		System.out.println(lastName);

		//Instantiate and initialize sb to firstname
		sb = new StringBuilder(firstName);
		sb.append(" " + lastName);
		System.out.println(sb);

		//Put the full name back together using stringbuilder append
		//method

		int k = 1;
		for(int row = 6; row >= 1; row--) {
			System.out.print(k);
			for(int i = 0; i <= row-2; i++) {
				System.out.print("*");
			}
			System.out.println("");
			k++;
		}

		Shirt shirt = new Shirt('M', 'R');
		shirt.display();

		Person student = new Student();
		student.setName("Francis");
		student.setAge(18);
		System.out.println(((Student) student).display());


		int x = 0;
		x++;
		System.out.println(x);









	}

}
