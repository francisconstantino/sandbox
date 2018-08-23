package com.codington.module6;
/**
 * POJO class for SAFARI domain object
 */
public class Safari {

	// Encapsulated data fields for SAFARI class

	// TODO 1 - create private variable safariName of String type.
	private String safariName;
	// TODO 2 - create private variable safariDescription of String type.
	private String safariDescription;
	// TODO 3 - create private variable safariCost of integer type.
	private int safariCost;
	// TODO 4 - create private variable safariDuration of integer type.
	private int safariDuration;
	// TODO 5 - create GETTER and SETTER methods of all variables.

	public String getSafariName() {
		return safariName;
	}
	public void setSafariName(String safariName) {
		this.safariName = safariName;
	}
	public String getSafariDescription() {
		return safariDescription;
	}
	public void setSafariDescription(String safariDescription) {
		this.safariDescription = safariDescription;
	}
	public int getSafariCost() {
		return safariCost;
	}
	public void setSafariCost(int safariCost) {
		this.safariCost = safariCost;
	}
	public int getSafariDuration() {
		return safariDuration;
	}
	public void setSafariDuration(int safariDuration) {
		this.safariDuration = safariDuration;
	}

	// TODO 6 - Override toString() method to print all the attribute values to display Safari details.

	@Override
	public String toString() {
		return "Safari [safariName=" + safariName + ", safariDescription="
				+ safariDescription + ", safariCost=" + safariCost
				+ ", safariDuration=" + safariDuration + "]";
	}
}
