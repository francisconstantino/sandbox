package com.codington.module7;
/**
 * POJO class for SAFARI domain object
 */
public class Safari {

	// Encapsulated data fields for SAFARI class

	private String safariName;
	private String safariDescription;
	private int safariCost;
	private int safariDuration;

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

	@Override
	public String toString() {
		return "Safari [safariName=" + safariName + ", safariDescription="
				+ safariDescription + ", safariCost=" + safariCost
				+ ", safariDuration=" + safariDuration + "]";
	}


}
