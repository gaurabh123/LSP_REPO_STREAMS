package org.howard.edu.lsp.finalexam.question2;

/**
 * Client program to test RandomNumberService with different strategies.
 */
public class RandomNumberClient {
    public static void main(String[] args) {
        RandomNumberService service = RandomNumberService.getInstance();

        service.setStrategy(new RandomNumberJava());
        System.out.println("Java Random Number: " + service.generateRandomNumber());

      
        service.setStrategy(new RandomNumberAlgorithm());
        System.out.println("LCG Random Number: " + service.generateRandomNumber());
    }
}