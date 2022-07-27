package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;
import java.io.BufferedWriter;

/**
 * 
 * Class for writing purpose only.
 * We first need to instance the SortSymptomDataFromArrayList class to get a TreeMap.
 * After instancing BufferedWriter, we iterate the map entries in order to get on each line "key : value" . 
 * @author Bastien 
 *
 */
public class WriteSymptomDataToFile implements IWriteSymptomDataToFile {
	/**
	 * @return a text file named result.out with a symptom type and its occurrences on each line.
	 */
	@Override
	public void writeSymptom(TreeMap<String, Integer> sortedSymptoms) {
	
		
/** 
* Instance of sorting class
*/
		//SortSymptomDataFromArrayList instanceSortSymptom = new SortSymptomDataFromArrayList();
		//TreeMap<String, Integer> sortedSymptoms = instanceSortSymptom.sortingSymptomsData();
		
/** 
* If the "result.out" file does not exist, we create it, then write on it.
*/
		
			try {
				
				FileWriter writer = new FileWriter("result.out");
				BufferedWriter bw = new BufferedWriter(writer);
				
/** 
 * Iterate map entries
 */
				for (Map.Entry<String, Integer> entry : sortedSymptoms.entrySet())
					bw.write(entry.getKey() + ": " + entry.getValue() + "\n");
				bw.close();
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println("Output file result.out created. Writing File : OK");
		}
	}

