package org.howard.edu.lsp.assignment2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Reads the content of the given file.
 */
public class FileReader {
	
    final String filePath;
    
    /**
     * Constructor for FileReader.
     *
     * @param filePath path of the text file.
     */
    public FileReader(String filePath) {
        this.filePath = filePath;
    }
    
    /**
     * Reads the File as IOStream. 
     * 
     * @return InputStream 
     */
    public InputStream getFileAsIOStream() {
    	InputStream ioStream = this.getClass()
    			.getClassLoader()
    			.getResourceAsStream(filePath);
    	if (ioStream == null) {
    		throw new IllegalArgumentException(filePath + "is not found");
    	}
    	return ioStream;
    }
    
    /**
     * Returns the content of the file as a Single Big String
     * 
     * @param InputStream object. 
     */
    public String returnFileContent(InputStream is) throws IOException {
        StringBuilder content = new StringBuilder();
        try (InputStreamReader isr = new InputStreamReader(is); 
             BufferedReader br = new BufferedReader(isr)) {
             String line;
            while ((line = br.readLine()) != null) {
                content.append(line).append(System.lineSeparator());
            }
        }
        return content.toString();
    }
    
}
