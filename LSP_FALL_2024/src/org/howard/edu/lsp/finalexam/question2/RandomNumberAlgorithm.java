package org.howard.edu.lsp.finalexam.question2;

/**
 * Implementation of RandomNumberStrategy using a Linear Congruential Generator.
 */
public class RandomNumberAlgorithm implements RandomNumber {
    private int Xo = 5; 
    private int m = 7;  
    private int a = 3;  
    private int c = 3; 
    private int current;

    public RandomNumberAlgorithm() {
        this.current = Xo;
    }

    @Override
    public int generateRandomNumber() {
        current = (current * a + c) % m;
        return current;
    }
}