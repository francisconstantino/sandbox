package com.codington.module7;
/**
 * The Park class can be used to represent parks at the NewCodington city.
 * It inherits its properties from the RidesHosting interface.
 */

public class Park implements RidesHosting {

	private int parkRide = 0;
	private int parkRideLocation = 0;
	/**
	 * Method for assigning ride category to the park.
	 */
	public void assignRideCategory() {
		this.parkRide = RidesHosting.LOWTHRILL;
	}

	/**
	 * Method for getting RIDEDETAILS based on the parkRide
	 */
	public String getRideDetails() {
		String rideDetails = null;
		if(parkRide == RidesHosting.LOWTHRILL) {
			rideDetails = "Low Thrill Rides for Children";
		} else if(parkRide == RidesHosting.HIGHTHRILL) {
			rideDetails = "High Thrill Rides for Teens and Adults";
		}
		return rideDetails;
	}

	/**
	 * Method for assigning RIDETYPE based on the parkRide
	 */

	public void assignRideLocation() {
		parkRideLocation = RidesHosting.OUTDOOR;
	}

	/**
	 * Method for getting RIDETYPE based on the parkRide
	 */
	public String getRideLocation() {
		String rideTypeDetails = null;
		if(parkRideLocation == RidesHosting.INDOOR) {
			rideTypeDetails = "Indoor Ride";
		}
		else if(parkRideLocation == RidesHosting.OUTDOOR) {
			rideTypeDetails = "Outdoor Ride";
		} else if (parkRideLocation == RidesHosting.VIRTUAL) {
			rideTypeDetails = "Virtual Ride";
		}
		return rideTypeDetails;
	}
}
