package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;
import java.io.File;
import java.io.BufferedWriter;

public class WriteSymptomDataToFile {

	public void WriteSymptomDataToFile() {
		
/** 
* Instance of sorting method
*/
		SortSymptomDataFromArrayList instanceSortSymptom = new SortSymptomDataFromArrayList();
		TreeMap<String, Integer> sortedSymptoms = instanceSortSymptom.sortingSymptomsData();
		
/** 
* If the "result.out" file does not exist, we create it, then write on it.
*/
		
		File file = new File("result.out.txt");
		if (!file.exists()) {
			try {
				file.createNewFile();
				
				FileWriter writer = new FileWriter(file);
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
/** 
* If file exists, just write on it.
*/
		} else {
			try {
				FileWriter writer = new FileWriter(file);
				BufferedWriter bw = new BufferedWriter(writer);

				for (Map.Entry<String, Integer> entry : sortedSymptoms.entrySet())
					bw.write(entry.getKey() + ": " + entry.getValue() + "\n");
				bw.close();
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println("Output file result.out overwritten. Writing File : OK");
		}
	}
}
