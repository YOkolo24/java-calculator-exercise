package com.codingblackfemales;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@DisplayName(value = "The Calculator should")
public class CalculatorTests {

    @Test
    @DisplayName("add two numbers")
    public void testAddition() {
        final Float sum = Calculator.add(2, 4);

        assertEquals(6, sum);
    }

    @Test
    @DisplayName("subtract two numbers")
    public void testSubtraction() {
        final Float difference = Calculator.subtract(2, 4);

        assertEquals(-2, difference);
    }

    @Test
    @DisplayName("multiply two numbers")
    public void testMultiplication() {
        final Float product = Calculator.multiply(2, 4);

        assertEquals(8, product);
    }

    @Test
    @DisplayName("divide two numbers")
    public void testDivision() {
        final float remainder = Calculator.divide(2, 4);

        assertEquals(0.5, remainder);
    }

    @Test
    @DisplayName("divide by Zero throws exception")
    public  void divideZero(){
        // final Integer result = Calculator.divide(5,0);

        assertThrows(ArithmeticException.class, () ->{ Calculator.divide(5,0);
        });

    }




}
