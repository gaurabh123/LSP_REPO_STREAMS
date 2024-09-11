package org.howard.edu.lsp.assignment2;

import java.util.HashMap;
import java.util.Map;

/**
 * Handles the logic for counting words from the parsed String. 
 * 
 */
public class WordCounter {
    public String stringFromFile;
    
    /**
     * Constructor for WordCounter.
     * 
     * @param stringFromFile
     */
    public WordCounter(String stringFromFile) {
        this.stringFromFile = stringFromFile;
    }
    
    /**
     * Converts the parsed String from file to the Word Count Map. 
     * 
     * @return Map<String, Integer>
     */
    public Map<String, Integer> stringToMap() {
        Map<String, Integer> wordCountMap = new HashMap<>();
        String[] words = stringFromFile.toLowerCase().replaceAll("'", " ").split("\\W+");
        for (String word : words) {
            if (word.length() > 3 && word.matches("[a-zA-Z]+")) {
                wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
            }
        }
        return wordCountMap;
    }
}