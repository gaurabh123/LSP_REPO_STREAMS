package org.howard.edu.lsp.finalexam.question2;

import java.util.Random;

/**
 * Implementation of RandomNumberStrategy using Java's built-in Random class.
 */
public class RandomNumberJava implements RandomNumber {
    private Random random = new Random();

    @Override
    public int generateRandomNumber() {
        return random.nextInt(Integer.MAX_VALUE) + 1;
    }
}