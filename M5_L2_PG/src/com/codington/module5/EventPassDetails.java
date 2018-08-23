package com.codington.module5;

/**
 *
 * EventPassDetails is about displaying participants and entry pass details for
 * various events taking place in New Codington town.
 */

public class EventPassDetails {

	// (I)Creating constant of different data types.

	// TODO 1.Declare a private static final float variable for children fare and initialize it to 5.
	private static final float childrenFare = 5F;
	// TODO 2.Declare a private static final float variable for adults fare and initialize it to 8.
	private static final float adultFare = 8F;

	public static void main(String[] args) {

	//(II)Create variables of different data types used in calculating the fare for event pass.


		// TODO 3. Declare an integer variable for number of children attending the event.
		int noOfChildren;
		// TODO 4. Declare an integer variable for number of adults attending the event.
		int noOfAdults;
		// TODO 5. Declare an integer variable for number of tickets.
		int noOfTickets;
		// TODO 6. Declare a double variable for total fare.
		double totalFare;
		// TODO 7.Declare a double variable for total children fare
		double totalChildrenFare;
		// TODO 8. Declare a double variable for total adults fare.
		double totalAdultsFare;

		// Initialize new declared variables for evening pass
		// TODO 9. Initialize the number of children to 5.
		noOfChildren = 5;
		// TODO 10. Initialize the number of adults to 2.
		noOfAdults = 2;
		// TODO 11. Initialize the number of tickets to sum of  number of children and  number of adults .
		noOfTickets = noOfChildren + noOfAdults;

		// TODO 12. Declare a boolean variable for evening pass or regular pass
		// a. Regular pass can be used between 9 AM till 5 PM
		// b. Evening pass can be used between 5 PM till 9 PM

		boolean pass;
		// short variable to identify pass validity
		// A pass can be valid for 1 day, 3 days or 5 days

		short passValidity;

		// Initialize newly declared variable for pass validity to 3
		passValidity = 3; // Try changing values between 1, 3 or 5

		System.out.println("Hello New Codington Visitors!");

		// TODO 13. Print children fare to the console.
		System.out.println("Children Fare: " + childrenFare);
		// TODO 14. Print adult fare to the console.
		System.out.println("Adult Fare: " + adultFare);
		// (III) Usage of basic arithmetic operators
		// TODO 15. Calculate total children fare by multiplying number of children with children fare.
		totalChildrenFare = noOfChildren * childrenFare;
		// TODO 16. Calculate total adults fare by multiplying number of adults with adults fare.
		totalAdultsFare = noOfAdults * adultFare;
		// TODO 17. Print total children fare to the console.
		System.out.println("Total Children Fare Collection: " + totalChildrenFare);
		// TODO 18. Print total adults fare to the console.
		System.out.println("Tocal Adults Fare Collection: " + totalAdultsFare);
		// TODO 19. Calculate total ticket fare by adding total children fare with total adult fare.
		totalFare = totalChildrenFare + totalAdultsFare;
		// TODO 20.Print total fare to the console.
		System.out.println("Total Fare Collection: " + totalFare);
		boolean eveningPass = true; // Try changing values true or false

		// (IV) Usage of If/Else structure
		// 21.Use If / Else structure to check for evening pass and print
		// appropriate message to the console
		// TODO 21.a If evening pass, print message
		// "Evening pass hours are from 5 PM - 9 PM, additional evening charge applicable for each pass."
		if(eveningPass) {
			System.out.println("Evening pass hours are from 5 PM - 9 PM, "
					+ "additional evening charge applicable for each pass.");
		}
		// TODO 21.b If regular pass, print message
		// "Regular pass hours are from 9 AM - 5 PM, no additional charge applicable."
		if(!eveningPass) {
			System.out.println("Regular pass hours are from 9 AM - 5 PM, no additional charge applicable.");
		}

		// 22.Use If / Else to verify evening pass and pass validity and print
		// appropriate message to the console
		// TODO 22.a. For evening pass and 1 day duration, print "Use of an evening pass incurs additional charge for each ticket."
		if(eveningPass && passValidity == 1) {
			System.out.println("Use of an evening pass incurs additional charge for each ticket.");
		}
		// TODO 22.b. For evening pass and 3 or 5 day duration, print "Use of a Evening pass incurs an additional charge, a discount is provided for use of an 3 or 5 day pass."
		else if(eveningPass && passValidity == 3 || passValidity == 5) {
			System.out.println("Use of a Evening pass incurs an additional charge, a discount is provided for use of an 3 or 5 day pass.");
		}
		// TODO 22.c. For any pass duration that is not equal to 1, 3 or 5, print "Please choose either 1, 3 or 5 days for pass duration."
		else if(passValidity != 1 || passValidity !=3 || passValidity != 5) {
			System.out.println("Please choose either 1, 3 or 5 days for pass duration.");
		}
		// TODO 22.d. otherwise, print "Regular pass offers discount based on pass duration."
			else {
			System.out.println("Regular pass offers discount based on pass duration.");
		}
		// (VI)- Usage of switch-case structure *
		// TODO 23. Declare String no of day and initialize it to "one".
		String noOfDay = "one";
		// TODO 23.a Use Switch-Case to verify pass duration and print appropriate message to the console
		// TODO 23.b On choosing a 1 day pass, print 'No discount on 1 day pass'
		// TODO 23.c. On choosing a 3 day pass, print '3 day pass offers 15% discount'
		// TODO 23.d On choosing a 5 day pass, print '5 day pass offers 25% discount'
		// TODO 23.e If an invalid option is chosen print 'Please choose only 1, 3 or 5 for valid pass duration.'
		switch(noOfDay) {
		case "one":
			System.out.println("No discount on 1 day pass");
			break;
		case "three":
			System.out.println("3 day pass offers 15% discount");
			break;
		case "five":
			System.out.println("5 day pass offers 25% discount");
			break;
		default:
			System.out.println("Please choose only 1, 3 or 5 for valid pass duration.");
		}
		// (VII):- Usage of for loop and while loop
		//TODO 24. Use single dimension array to store travel pass IDs and initialize it to total number of children and number of adults participating in an event.
		int[] id = new int[noOfTickets];
		/*TODO 25. Use for loop to generate travel pass ID as :
				* No of tickets as upper bound
				* Initialize it with integer i as zero
				* Increment i by 1.
				  In the for Loop, each element of the travel pass single dimension array is assigned with a value calculated as the sum of i and one.
		           */
		for(int i = 0; i < noOfTickets; i++) {
			id[i] = i + 1;
		}

		System.out.println();
		System.out.println("Travel Pass Ids:");
		//TODO  26.	Print the values of the travel pass IDs using the do/while loop.
		//TODO  27. Use while loop to check if the participation of children is more than the adults and print the message that the participation of children is more than adult if the check is passed.
		//Use break to come out of the while loop.

		int i = 0;
		do {
			System.out.println("\tID " + (i + 1) + ": " + id[i]);
			++i;
		} while (i < noOfTickets);

		while(noOfChildren > noOfAdults) {
			System.out.println("Children participation is more than adults.");
			break;
		}


	}

}
