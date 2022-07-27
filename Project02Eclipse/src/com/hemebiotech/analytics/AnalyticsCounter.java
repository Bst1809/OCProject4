package com.hemebiotech.analytics;

import java.util.List;
import java.util.TreeMap;

public class AnalyticsCounter {
	
	public static void main(String args[]) {	
		
		ReadSymptomDataFromFile instanceReadSymptom = new ReadSymptomDataFromFile("symptoms.txt");
		List<String> allSymptomsList = instanceReadSymptom.getSymptoms();
		
		SortSymptomDataFromArrayList instanceSortSymptom = new SortSymptomDataFromArrayList();
		TreeMap<String, Integer> sortedSymptoms = instanceSortSymptom.sortingSymptomsData(allSymptomsList);
		
		WriteSymptomDataToFile instanceWriter = new WriteSymptomDataToFile();
		instanceWriter.writeSymptom(sortedSymptoms);		
}
}
