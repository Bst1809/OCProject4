package com.hemebiotech.analytics;

import java.util.TreeMap;

public interface IWriteSymptomDataToFile {
	
	public void writeSymptom(TreeMap<String, Integer> sortedSymptoms);

}
