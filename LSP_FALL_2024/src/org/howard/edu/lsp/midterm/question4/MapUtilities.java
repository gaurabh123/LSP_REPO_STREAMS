package org.howard.edu.lsp.midterm.question4;

import java.util.HashMap;

/**
 * The MapUtilities class provides utility methods for working with HashMaps.
 * 
 */
public class MapUtilities {
	
	/**
     * Returns the number of common key/value pairs between the two HashMaps.
     *
     * @param map1 the first HashMap
     * @param map2 the second HashMap
     * @return the number of common key/value pairs
     */
	public static int commonKeyValuePairs(HashMap<String, String> map1, HashMap<String, String> map2) {
		
        int commonCount = 0;
        for (String key : map1.keySet()) {
            if (map2.containsKey(key) && map1.get(key).equals(map2.get(key))) {
                commonCount++;
            }
        }
        return commonCount;
    }
}
