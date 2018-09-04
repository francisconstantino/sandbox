package com.codington.module8;

/**
 * CheckEventPass  is about checking the number of tickets assigned ticket ID's.
 * Topic: Java Error Handling and Assertions.
 */
public class CheckPassEvent {
	public static void main(String[] args) {

		int noOfChildren;
		int noOfAdults;
		int noOfTickets;
		int[] ticketIDs;
		int aveVisitor;
		int noOfDays = 0;
		noOfChildren = 2;
		noOfAdults = 6;
		noOfTickets = noOfChildren + noOfAdults;
		ticketIDs = new int[noOfTickets];

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
		int passID = 0;
		for(int i = 0; i < noOfTickets - 1; i++) {
			passID = i + 1;
			ticketIDs[i] = passID;
		}

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
