package org.howard.edu.lsp.midterm.question2;

/**
 * The Calculator class provides utility methods to sum numbers.
 * 
 */
public class Calculator {
	
	/**
     * Sums two integers.
     *
     * @param intergerOne the first integer
     * @param intergerTwo the second integer
     * @return the sum of the two integers
     */
	public static int sum(int intergerOne, int intergerTwo) {
        return intergerOne + intergerTwo;
    }
	
	/**
     * Sums two double values.
     *
     * @param doubleOne the first double value
     * @param doubleTwo the second double value
     * @return the sum of the two double values
     */
    public static double sum(double doubleOne, double doubleTwo) {
        return doubleOne + doubleTwo;
    }
    
    /**
     * Sums all elements in an array of integers.
     *
     * @param numberArray the array of integers
     * @return the sum of all elements in the array
     */
    public static int sum(int[] numberArray) {
        int sumOfAll = 0;
        for (int eachNum : numberArray) {
        	sumOfAll += eachNum;
        }
        return sumOfAll;
    }
	
}
