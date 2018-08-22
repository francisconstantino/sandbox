package com.codington.module4;

public class CodingtonEventDetails {

	private enum EventLocation { NORTH, SOUTH }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Event event1 = new Event();

		event1.setEventName("Royal Codington Show");
		event1.setDuration(1);
		event1.setLocation(EventLocation.NORTH.toString());
		event1.eventDate = "Wednesday, NOV 25, 2015 at 11:00 hrs";

		Event event2 = new Event();
		event2.setEventName("Science Alive");
		event2.setDuration(2);
		event2.setLocation(EventLocation.SOUTH.toString());
		event2.eventDate = "Wednesday, NOV 25, 2015 at 16:00 hrs";

		System.out.println("Hello Visitors!!\n");
		System.out.println("Event Name = " + event1.getEventName());
		System.out.println("Duration in hours = " + event1.getDuration());
		System.out.println("Location = " + event1.getLocation());
		System.out.println("When = " + event1.eventDate + "\n");

		System.out.println("Event Name = " + event2.getEventName());
		System.out.println("Duration in hours = " + event2.getDuration());
		System.out.println("Location = " + event2.getLocation());
		System.out.println("When = " + event2.eventDate);

	}

}
