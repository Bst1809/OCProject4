package com.hemebiotech.analytics;

import java.util.*;

/**
 * 
 * Creating a TreeMap class to implement SortedMap interface that will extends to Map interface.
 * Map Interface is used to get key-value pairs. Here, keys are unique type of symptoms and values are their occurrences.
 * TreeMap is used instead of Map for alphabetical sorting purpose.  
 * @author Bastien 
 *
 */

public class SortSymptomDataFromArrayList implements ISortSymptomDataFromArrayList{
	/**
	 * 
	 * @return an alphabetical sorted list of keys and values without duplicates. Keys being symptoms and Values being occurrences.
	 */
	
	@Override
	public TreeMap<String, Integer> sortingSymptomsData(List<String> allSymptomsList) {

		//ReadSymptomDataFromFile instanceReadSymptom = new ReadSymptomDataFromFile("symptoms.txt");
		//List<String> allSymptomsList = instanceReadSymptom.getSymptoms();		

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
		
		return sortedSymptoms;

	}
}
