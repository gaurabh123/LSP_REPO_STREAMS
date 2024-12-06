package org.howard.edu.lsp.finalexam.question1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MathUtilsTest {
	MathUtils mathClass = new MathUtils();
	
	@Test
    @DisplayName("Test case for positive Factorial")
	public void testPositiveFactorial() {
		assertEquals(720, mathClass.factorial(6)); 
        assertEquals(1, mathClass.factorial(0));  
        assertEquals(1, mathClass.factorial(1));  
	}
	
	@Test
	@DisplayName("Test case for negative factorial")
	public void testNegativeFactorial() throws IllegalArgumentException{
		IllegalArgumentException illegalException = assertThrows(
                IllegalArgumentException.class,
                () -> mathClass.factorial(-5)
        );
		assertEquals("Number must be non-negative", illegalException.getMessage());
	}
	
	@Test
	@DisplayName("Test for prime for negative numbers")
	public void testNegativePrime() {
		assertFalse(mathClass.isPrime(-4));
		
	}
	
	@Test
	@DisplayName("Test for prime for other numbers")
	public void testPrime() {
		assertTrue(mathClass.isPrime(2));  
        assertTrue(mathClass.isPrime(3));  
        assertTrue(mathClass.isPrime(13)); 
        assertFalse(mathClass.isPrime(1)); 
        assertFalse(mathClass.isPrime(9)); 
	}
	
	@Test
	@DisplayName("GCD test both input 0")
    void testGcdBothZero() {
        IllegalArgumentException illegalException = assertThrows(
                IllegalArgumentException.class,
                () -> mathClass.gcd(0, 0)
        );
        assertEquals("Both numbers cannot be zero", illegalException.getMessage());
    }
	
	@Test
	@DisplayName("GCD one input 0")
    void testGcdOneZero() {
        assertEquals(5, mathClass.gcd(5, 0));  
        assertEquals(10, mathClass.gcd(0, 10)); 
    }
	
	@Test
	@DisplayName("Both valid inputs")
    void testGcdValid() {
        assertEquals(5, mathClass.gcd(10, 5));   
        assertEquals(6, mathClass.gcd(54, 24)); 
        assertEquals(1, mathClass.gcd(7, 3)); 
    }
	
	@Test
	@DisplayName("Negative Inputs")
    void testGcdNegative() {
        assertEquals(5, mathClass.gcd(-10, -5));   
        assertEquals(6, mathClass.gcd(-54, 24));  
    }
	
}
