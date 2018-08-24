package com.codington.module7;

/**
 * Interface for implementing common methods for PARK and ZOO classes
 */
public interface RidesHosting {

	public static final int LOWTHRILL = 1;
	public static final int HIGHTHRILL = 2;
	public static final int INDOOR = 3;
	public static final int OUTDOOR = 4;
	public static final int VIRTUAL = 5;

	public abstract void assignRideCategory();
	public abstract String getRideDetails();
	public abstract void assignRideLocation();
	public abstract String getRideLocation();
}
