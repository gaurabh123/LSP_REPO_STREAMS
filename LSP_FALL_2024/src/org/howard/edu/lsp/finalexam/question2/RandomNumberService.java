package org.howard.edu.lsp.finalexam.question2;

/**
 * Singleton service for generating random numbers using different strategies.
 */
public class RandomNumberService {
    private static RandomNumberService instance;
    private RandomNumber strategy;

    private RandomNumberService() {}

    /**
     * Gets the singleton instance of RandomNumberService.
     * @return the singleton instance
     */
    public static RandomNumberService getInstance() {
        if (instance == null) {
            instance = new RandomNumberService();
        }
        return instance;
    }

    /**
     * Sets the random number generation strategy.
     * @param strategy the strategy to set
     */
    public void setStrategy(RandomNumber strategy) {
        this.strategy = strategy;
    }

    /**
     * Generates a random number using the current strategy.
     * @return a random positive integer
     */
    public int generateRandomNumber() {
        if (strategy == null) {
            throw new IllegalStateException("Strategy not set");
        }
        return strategy.generateRandomNumber();
    }
}