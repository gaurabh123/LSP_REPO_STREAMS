package org.howard.edu.lsp.assignment2;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

/**
 * Main Class, constructs the required objects and runs the logic. 
 */
public class Main {
	private static final String FILE_CONTENT = "FILE CONTENTS";
	private static final String WORD_COUNT = "WORD COUNTS";
	
	public static void main(String[] args) throws IOException{
		try {
            FileReader readFile = new FileReader("wordsOne.txt");
            InputStream is = readFile.getFileAsIOStream();
            String fileContents = readFile.returnFileContent(is);
            
            System.out.println(FILE_CONTENT);
            System.out.println(fileContents);
            
            WordCounter wordCount = new WordCounter(fileContents);
            Map<String, Integer> finalMap = wordCount.stringToMap();
            
            System.out.println(WORD_COUNT);
            for (Map.Entry<String, Integer> entry : finalMap.entrySet()) {
                System.out.println(entry.getKey() + ":" + entry.getValue());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
