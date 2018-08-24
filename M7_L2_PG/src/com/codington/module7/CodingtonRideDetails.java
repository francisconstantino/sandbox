package com.codington.module7;

/**
 * Topic: Polymorphism in Java
 * CodingtonRideDetails class for displaying information about Rides hosted in Park and Zoo.
 * The code here depicts how a parent class variable can be used to manipulate objects of various subclasses classes
 * also, how it can  invoke methods on an child object without knowing that object’s type.
 * Instructions: Follow TODO instructions given below
 */

public class CodingtonRideDetails {


	//Main method for entry point of CodingtonRideDetails program

	public static void main(String[] args) {

		RidesHosting park = new Park();
		park.assignRideCategory();
		park.assignRideLocation();
		RidesHosting zoo = new Zoo();
		zoo.assignRideCategory();
		zoo.assignRideLocation();
		System.out.println("Rides Category of PARK : " + park.getRideDetails());
		System.out.println("Rides Location of Park : " + park.getRideLocation());
		System.out.println("Rides Category of Zoo : " + zoo.getRideDetails());
		System.out.println("Rides Location of Zoo : " + zoo.getRideLocation());
	}

}

