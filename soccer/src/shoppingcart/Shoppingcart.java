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

//		int k = 1;
//		for(int row = 6; row >= 1; row--) {
//			System.out.print(k);
//			for(int i = 0; i <= row-2; i++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//			k++;
//		}

		System.out.println("");

//		for(int row = 6; row >= 1; row--) {
//			for(int i = 0; i <= row-1; i++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}

//		for(int row = 0; row <= 5; row++) {
//			for(int i = 0; i <= row; i++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}

//		for(int row = 1; row <= 6; row++) {
//			for(int i = 1; i <= row; i++) {
//				System.out.print(i);
//			}
//
//			System.out.println("");
//		}

//		int k = 1;
//		for(int row = 6; row >= 1; row--) {
//			for(int i = 0; i <= row-1; i++) {
//				if(k == 1){
//					System.out.println(k);
//				}
//				System.out.print("*");
//			}
//			System.out.println("");
//			k++;
//		}

//		int k = 1;
//		for(int row = 1; row <= 6; row++) {
//			for(int i = 1; i <=6; i++) {
//				if (row >= i) {
//					System.out.print(i);
//				} else {
//					System.out.print("*");
//				}
//			}
//			System.out.println("");
//		}

		int k = 1;
		for(int row = 6; row >= 1; row--) {
			for(int i = 1; i <=6; i++) {
				if(i < row) {
					System.out.print(i);
				} else {
					System.out.print("&");
				}
			}
			System.out.println("");
		}













	}

}
