package com.hemebiotech.analytics;

import java.util.*;

public class SortSymptomDataFromArrayList {

	public TreeMap<String, Integer> sortingSymptomsData() {
		
/**
* Instance of reading method 
*/

		ReadSymptomDataFromFile instanceReadSymptom = new ReadSymptomDataFromFile("symptoms.txt");
		List<String> allSymptomsList = instanceReadSymptom.getSymptoms();
		
/**
* Declaring Treemap to put unique symptoms types as keys and number of occurrences as values.
* Use of Treemap instead of HashMap for alphabetical sorting purpose.
*/

		TreeMap<String, Integer> sortedSymptoms = new TreeMap<String, Integer>();
/** 
 * Iterate keys and values.
 */
		for (String symptomUniqueType : allSymptomsList) {
			if (sortedSymptoms.containsKey(symptomUniqueType)) {
				sortedSymptoms.put(symptomUniqueType, sortedSymptoms.get(symptomUniqueType) + 1);
			} else {
				sortedSymptoms.put(symptomUniqueType, 1);
			}
		}
		System.out.println("Counting File : OK - Number of Symptoms = " + sortedSymptoms.size());
		
/** 
* @return an alphabetical sorted list of keys and values. Keys being symptoms and Values being occurrences. 
*/
		return sortedSymptoms;

	}
}
