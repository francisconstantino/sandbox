package com.codington.module7;


 /**
 * The Zoo class can be used to represent zoo at the NewCodington city.
 * It inherits its properties from the RidesHosting interface
 */

public class Zoo implements RidesHosting {

	//TODO 1 - Declare a local private integer variable to hold number of animals value and initialize it to zero.
	//TODO 2 - Declare an array of String to hold animal names and initialize it to empty string.
	//TODO 3- Declare an instance of Safari class with private access modifier and assign null value to it.
	//This Safari class will be composed in Zoo class.
	//TODO 4 - Declare a local private integer variable to hold zoo ride value and initialize it to zero.
	//TODO 5 - Declare a local private integer variable to hold zoo ride location and initialize it to zero.
	//TODO 6 - Define getter method for instance variable noOfAnimals.
	//TODO 7 - Define setter method for instance variable noOfAnimals.
	//TODO 8 - Define getter method for instance variable animalNames.
	//TODO 9 - Define setter method for instance variable animalNames.
	//TODO 10 - Define getter method for instance variable safari.
	//TODO 11 - Define setter method for instance variable safari.
	//TODO 12 - Define getter method for instance variable zooRide.
	//TODO 13 - Define setter method for instance variable zooRide.

	public void assignRideCategory() {
		/* TODO 14 - Assigning the high thrill value to the zooRide instance variable.
		 * 	Hint: use the HIGH_THRILL constant defined in the RidesHosting interface
		 */
	}


	/**
	 * Method to display ride details based on ride type
	 */
	public String getRideDetails() {

		//TODO 15 i. Create a String variable ride details and initialize it.
		//TODO 15 ii. Use if...else loop to check parkRide value.
		//TODO 15 iii. Check if zooRide is equal to RidesHosting.LOW_THRILL
		//		and assign the value "Low Thrill Rides for Children" into the String variable rideDetails.
		//TODO 15 iv. Check if zooRide is equal to RidesHosting.HIGH_THRILL
		//		and store value "High Thrill Rides for Teens and Adults" into ride details.
		//TODO 15 v. return rideDetails.
		return null;

	}

	/**
	 * Method for assigning RIDETYPE based on the zooRide
	 */
	public void assignRideLocation() {
		//TODO 16. Assign the value of RidesHosting virtual CONSTANT to the member variable for zoo ride location.
		}


	/**
	 * Method for getting RIDETYPE based on the parkRide
	 */
	public String getRideLocation() {
		//TODO 17 a. Define a string variable rideTypeDetails and initialize it with null value;
		// TODO b.	Check if parkRideLocation is equal to RidesHosting.INDOOR to set rideTypeDetails value as “Indoor Ride”.
		// TODO c.	Check if parkRideLocation is equal to RidesHosting.OUTDOOR to set rideTypeDetails value as “Outdoor Ride”.
		// TODO d.	Check if parkRideLocation is equal to RidesHosting.VIRTUAL to set rideTypeDetails value as “Virtual Ride”.
		// 		Hint: Use if/else loop to check the parkRideLocation value using RidesHosting constants.
		// TODO e: return the value for rideTypeLocation
		return null;
	}
}

