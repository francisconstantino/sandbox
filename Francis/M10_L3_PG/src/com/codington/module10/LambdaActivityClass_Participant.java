package com.codington.module10;

/**
*
* Topic : Java Collections
*
* Instructions :
* 1. Activity to implement Map collection of Java Collections Framework using Lambda Expression
* 2. Code as per the TODOs
*
*/

public class LambdaActivityClass_Participant {

	/**
	 * Type code to create a HashMap of key value pairs<br/>
	 * where key is id of type String and value is a location of type string
	 *
	 * Use Stream and Lambda Expression to filter values of map and create a new filtered map from that data
	 *
	 * @param args
	 */
	public static void main(String[] args) {

		// TODO 1 Create a Map<String, String> object using HashMap constructor.

		// TODO 2 Populate the map using the put() method. Fill at least 6 values in Map with Key as Event ID (example: E_001) and value as Event location (North or South).

		// TODO 3 Create a Set<String> object that contains all the map keys retrieved using the keySet() method.

		// TODO 4 Create a Collection<String>  object that contains all the key values retrieved using the values() method.

		// TODO 5 Print the statement in console "List of available events are as below:" before printing the map details.

		// TODO 6 Print all the map key collected in Set<String>.

		// TODO 7 Print all the map values collected in Collection<String>.

		// TODO 8 Print the statement in console "List of available events in NORTH location are as below:" before printing the updated map details.

		// TODO 9 Print the events in North location using Lambda expression as -
		//			a)	Get a stream using map entrySet.
		//			b)	Filter stream only for map values as "North" location:
		//				"e -> e.getValue().equalsIgnoreCase("North")".
		//			c)	Print the map keys for value “North” location:
		//				"forEach(e -> System.out.println(e.getKey()))"

	}
}


