package com.codington.module6;

public class RidesDetails {

		/**
		 *
		 * Topic: Inheritance in Java
		 * Activity to implement inheritance concepts.		 *
		 * Instructions:Code as per TODOs.
		 */

		// Main method for entry point of RidesDetails program.
		public static void main(String[] args){

			//TODO 1. Create an instance of the ZOO class by invoking a parameterized constructor and passing a double type argument 12.45.
			Zoo zoo = new Zoo(12.45);
			//TODO 2. Set zoo animals details by setting the no of animals attribute to 6.
			zoo.setNoOfAnimals(6);
			//TODO 3. Set zoo animals details by setting the animals names by following below instructions.
			//TODO 3.a Declare a string array and initialize it with animal names like Lion, African Elephants,Australian Kangaroos,Giraffe,Deer,Rhinoceros.
			String[] animalNames = {"Lion", "African Elephants", "Australian Kangaroos", "Giraffe", "Deer", "Rhinoceros" };
			//TODO 3.b Invoke setAnimalNames method to zoo class and pass zooAnimals string array.

			//TODO 3.c set the zooAnimals string array value to null.
			//TODO 4.Create an instance of the Safari class.
			Safari safari = new Safari();
            // TODO 5. Set values for Safari class attribute, SafariCost to 2500.
			safari.setSafariCost(2500);
			// TODO 6. Set values for Safari class attribute, safari description to Night Safari.
			safari.setSafariDescription("Night Safari");
            //TODO 7. Set values for Safari class attribute, safari duration to 45.
			safari.setSafariDuration(45);
            //TODO 8. Set values for Safari class attribute, safari name to South Codington Safari.
			safari.setSafariName("South Codington Safari");
            //TODO 9. Call setSafari() method of Zoo class by passing the Safari class object populated in above step.

			//TODO 10. Call setServiceTax() method of Zoo class by passing a double value 20.50.
			zoo.serviceTax = 20.50;
        	//TODO 11. Call assignRideCategory() method of Zoo class.
			zoo.assignRideCategory();
            //TODO 12.Invoke getAnimalNames() method of zoo class and assign return value to instance variable zooAnimals.
            //TODO 13. Display animal details by looping through the string array zooAnimals.
            //TODO 14. Display rides category zoo details by invoking getRideDetails() method.
            zoo.getRideDetails();
			//TODO 15. Display rides safari details by invoking getSafari() method.
            safari.toString();
			 //TODO 16. Display zoo fare by invoking calculateFare() method.
            zoo.calculateFare(baseFare, serviceTax);
}
}
