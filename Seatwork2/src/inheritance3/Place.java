package inheritance3;

public abstract class Place {
	private String placeName;
	private int capacity = 500;
	private String placeDescription;
	private int workingHours;

	public abstract void showEvents();

	public String getPlaceName() {
		return placeName;
	}

	public void setPlaceName(String placeName) {
		this.placeName = placeName;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public String getPlaceDescription() {
		return placeDescription;
	}

	public void setPlaceDescription(String placeDescription) {
		this.placeDescription = placeDescription;
	}

	public int getWorkingHours() {
		return workingHours;
	}

	public void setWorkingHours(int workingHours) {
		this.workingHours = workingHours;
	}


}
