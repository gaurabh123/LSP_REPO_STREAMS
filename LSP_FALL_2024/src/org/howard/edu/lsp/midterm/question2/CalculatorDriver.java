package org.howard.edu.lsp.midterm.question2;

/**
 * The CalculatorDriver class demonstrates the functionality of the Calculator class.
 * 
 */
public class CalculatorDriver {
	
	/**
     * The main method is the entry point of the application.
     * Usage of sum methods
     * 
     * @param args Command line arguments
     */
	public static void main(String[] args) { 
	
        System.out.println(Calculator.sum(5, 10)); 

        System.out.println(Calculator.sum(3.5, 7.8));

        System.out.println(Calculator.sum(new int[]{1, 2, 3, 4, 5}));
	}
}
