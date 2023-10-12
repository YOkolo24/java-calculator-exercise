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
        final Integer sum = Calculator.add(2, 4);

        assertEquals(6, sum);
    }

    @Test
    @DisplayName("subtract two numbers")
    public void testSubtraction() {
        final Integer difference = Calculator.subtract(2, 4);

        assertEquals(-2, difference);
    }

    @Test
    @DisplayName("multiply two numbers")
    public void testMultiplication() {
        final Double multiplication = Calculator.multiply(7, 6);

        assertEquals(42, multiplication);
    }

    @Test
    @DisplayName("divide two numbers")
    public void testDivision() {
        final Double division = Calculator.divide(10, 2);

        assertEquals(5, division);
    }

    @Test
    @DisplayName("multiply two numbers (one positive, one negative)")
    public void testMultiplication2() {
        final Double multiplication2 = Calculator.multiply(-5, 6);

        assertEquals(-30, multiplication2);
    }

    @Test
    @DisplayName("multiply two numbers (two negative)")
    public void testMultiplication3() {
        final Double multiplication3 = Calculator.multiply(-4, -3);

        assertEquals(12, multiplication3);
    }

    @Test
    @DisplayName("divide two numbers (decimal answer)")
    public void testDivision2() {
        final Double division2 = Calculator.divide(12, 8);

        assertEquals(1.5, division2);
    }

    @Test
    @DisplayName("multiply two numbers (two decimals)")
    public void testMultiplication4() {
        final Double multiplication4 = Calculator.multiply(7.5, 5.7);

        assertEquals(42.75, multiplication4);
    }

    @Test
    @DisplayName("divide by zero throws exception")
    public void divideByZero() {
        final Double result = Calculator.divide(5,0);

        assertThrows(ArithmeticException.class, () -> { 
            Calculator.divide(5, 0);
        });
    }
}
