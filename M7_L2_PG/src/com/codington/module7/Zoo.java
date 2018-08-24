package com.codington.module7;


 /**
 * The Zoo class can be used to represent zoo at the NewCodington city.
 * It inherits its properties from the RidesHosting interface
 */

public class Zoo implements RidesHosting {

	private int noOfAnimals = 0;
	String[] animalNames = new String[10];
	private Safari safari = new Safari();
	private int zooRideValue  = 0;
	private int zooRideLocation = 0;

	public int getNoOfAnimals() {
		return noOfAnimals;
	}

	public void setNoOfAnimals(int noOfAnimals) {
		this.noOfAnimals = noOfAnimals;
	}

	public String[] getAnimalNames() {
		return animalNames;
	}

	public void setAnimalNames(String[] animalNames) {
		this.animalNames = animalNames;
	}

	public Safari getSafari() {
		return safari;
	}

	public void setSafari(Safari safari) {
		this.safari = safari;
	}

	public int getZooRideValue() {
		return zooRideValue;
	}

	public void setZooRideValue(int zooRideValue) {
		this.zooRideValue = zooRideValue;
	}

	public int getZooRideLocation() {
		return zooRideLocation;
	}

	public void setZooRideLocation(int zooRideLocation) {
		this.zooRideLocation = zooRideLocation;
	}

	public void assignRideCategory() {
		setZooRideValue(RidesHosting.HIGHTHRILL);
	}

	/**
	 * Method to display ride details based on ride type
	 */
	public String getRideDetails() {

		String rideDetails = null;
		if(getZooRideValue() == RidesHosting.LOWTHRILL) {
			rideDetails = "Low Thrill Rides for Children";
		} else if(getZooRideValue() == RidesHosting.HIGHTHRILL) {
			rideDetails = "High Thrill Rides for Teens and Adults";
		}
		return rideDetails;

	}

	/**
	 * Method for assigning RIDETYPE based on the zooRide
	 */
	public void assignRideLocation() {
		zooRideLocation = RidesHosting.VIRTUAL;

	}


	/**
	 * Method for getting RIDETYPE based on the parkRide
	 */
	public String getRideLocation() {
		String rideTypeDetails = null;
		if(zooRideLocation == RidesHosting.INDOOR) {
			rideTypeDetails = "Indoor Ride";
		} else if (zooRideLocation == RidesHosting.OUTDOOR) {
			rideTypeDetails = "Outdoor Ride";
		} else if (zooRideLocation == RidesHosting.VIRTUAL) {
			rideTypeDetails = "Virtual Ride";
		}
		return rideTypeDetails;
	}
}

