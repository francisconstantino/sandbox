package com.codington.module7;
/**
 * The Park class can be used to represent parks at the NewCodington city.
 * It inherits its properties from the RidesHosting interface.
 */

public class Park implements RidesHosting {

	//TODO 1. Create a private instance variable park ride and assign it the value of zero.
	//TODO 2. Create a parkRideLocation and assign it value zero.
	/**
	 * Method for assigning ride category to the park.
	 */
	public void assignRideCategory() {
	//TODO 3. Assign the value RidesHosting.LOW_THRILL to parkRide variable.
	}

	/**
	 * Method for getting RIDEDETAILS based on the parkRide
	 */
	//TODO 4. Override getRideDetails() method of interface RidesHosting.
	public String getRideDetails()
	{
		//TODO a. Create a String variable ride details and initialize it with empty string.
		//TODO b. Use if/else block to check the parkRide value.
		//TODO c  Check if parkRide is equal to RidesHosting.LOW_THRILL and
		//		assign the value "Low Thrill Rides for Children" into the String variable rideDetails.
		//TODO d  Check if parkRide is equal to RidesHosting.HIGH_THRILL and
		// 		store value "High Thrill Rides for Teens and Adults" into rideDetails.
		//TODO e return rideDetails.
		return null;
	}

	/**
	 * Method for assigning RIDETYPE based on the parkRide
	 */

	public void assignRideLocation() {
		//TODO 5.Assigning the value of constant RidesHosting.OUTDOOR to  parkRideLocation.
	}

	/**
	 * Method for getting RIDETYPE based on the parkRide
	 */
	//TODO 6.	Override getRideLocation() method.
	public String getRideLocation() {
		//TODO a.	Create a variable rideTypeDetails of String type and initialize it with null value.
		//TODO b.	Check if parkRideLocation is equal to RidesHosting.INDOOR to set rideTypeDetails value as “Indoor Ride”.
		//TODO c.	Check if parkRideLocation is equal to RidesHosting.OUTDOOR to set rideTypeDetails value as “Outdoor Ride”.
		//TODO d.	Check if parkRideLocation is equal to RidesHosting.VIRTUAL to set rideTypeDetails value as “Virtual Ride”.
		//	Hint: Use if/else loop to check the parkRideLocation value using RidesHosting constants.
		//TODO e. Return the value of rideTypeDetails.
		return null;
	}
}
