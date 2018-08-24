package com.codington.module8;

/**
 * CheckEventPass  is about checking the number of tickets assigned ticket ID's.
 * Topic: Java Error Handling and Assertions.
 */
public class CheckPassEvent {
	public static void main(String[] args) {

		//TODO 1.	Declare an integer for the number of children attending the event
		int noOfChildren;
		//TODO 2.	Declare an integer for the number of adults attending the event.
		int noOfAdults;
		//TODO 3.	Declare an integer for the number of tickets.
		int noOfTickets;
		//TODO 4.	Declare a single dimensional integer array for ticket ID's.
		int[] ticketIDs;
		//TODO 5.	Declare an integer average visitor.
		int aveVisitor;
		//TODO 6.	Declare an integer no of days and initialize it with zero.
		int noOfDays = 0;
		//TODO 7.	Initialize the number of children to 2.
		noOfChildren = 2;
		//TODO 8.	Initialize the number of adults to 6.
		noOfAdults = 6;
		//TODO 9.	Initialize the number of tickets with the sum of number of children and number of adults.
		noOfTickets = noOfChildren + noOfAdults;
		//TODO 10.	Initialize the ticket ID array with number of tickets as the size.
		ticketIDs = new int[noOfTickets];
		 //Note:Try changing value of "ticketID" index from [noOfTickets] to [noOfTickets-1] in next run and see the output.

		//TODO 11.	Declare a try/catch/finally block.

		//TODO 11.a In try block, print the last element of ticketID array.
		 //TODO 11.b In try block,  calculate the average visitor value by dividing number of tickets  by no of days.
		//TODO 11.c Surround the try block  with catch block by passing ArithmeticException and ArrayIndexOutOfBoundsException as parameter.
		//TODO 11.d In catch block, print the type of exception thrown by printing the value of exception parameter
		//TODO 11.e In finally block, print the message �Executing the finally block.�.
		//TODO 11.f In finally block, set the number of days to the value 2.
		//TODO 11.g    In finally block, calculate the average visitor value by dividing number of tickets  by no of days.
		//TODO 11.h    In finally block, print  the value of average visitor.
		try {
			System.out.println("Access element of ticket id := " + ticketIDs[noOfTickets - 1]);
			aveVisitor = noOfTickets / noOfDays;
		} catch(ArithmeticException e) {
			System.out.println("Exception thrown : " + e);
			//e.printStackTrace();
		} finally {
			System.out.println("Executing the finally block.");
			noOfDays = 2;
			aveVisitor = noOfTickets / noOfDays;
			System.out.println("Average visitor per day: " + aveVisitor);
		}
		//Assign IDs to tickets
		//TODO 12.Declare an integer for pass id and initialize it with zero.
		/*TODO 13.	Use for loop to populate the ticket ID array.
		 *     a.	Declare an integer i for the loop index and assign it value zero inside the loop .
		 *     b.	Use 'No of tickets' as upper bound.
		 *     c.	Increment the loop index 'i' by 1.
		 */
		int passID = 0;
		for(int i = 0; i < noOfTickets - 1; i++) {
			passID = i + 1;
			ticketIDs[i] = passID;
		}
		//TODO 13.i.Inside the for loop, pass ID can be generated by adding 1 to the loop index.
		//TODO 13.ii.Inside the for loop, assign pass id generated to the respective element of the ticket ID array  .
		// Verify all the tickets issued assigned with ticket ID's using assert.
	 	//TODO 14. Declare an integer variable for the loop index and initialize with zero.
		//TODO 15. Print �Verifying tickets assigned with ticket ID's� message to the console.
		//TODO 16. Loop through the ticketID array using a do..while loop with array size as the boundary.
		/*TODO 17. Inside the do..while loop
		      *i. Verify if value of each element of the ticket id array is not equal to zero using assert statement.
		      *ii. If the value of ticket id array element is equal to zero, print 'Mismatch in issuance of ticket ID's' to the console as an assertion error.
		      *iii. Print ticket ID value to console.
		      *iv. Increase the loop index and verify all the values in the array.*/
		//TODO 18.Print 'Ticket ID's are assigned to total number of tickets issued.' to the console after exiting the do..while loop.

		int i = 0;
		System.out.println("Verifying tickets assigned with ticket ID's");

		do {
			assert ticketIDs[i] != 0 : "Mismatch in issuance of ticket ID's";
			System.out.println("Ticket ID =  " + ticketIDs[i]);
			i++;
		} while (i < noOfTickets);

		System.out.println("Ticket ID's are assigned to total number of tickets issued.");



	}
}
