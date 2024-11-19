package ch.hslu.oop.sw06;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    void testAdd() {
        Calculator calculator = new Calculator();
        assertEquals(calculator.addition(3, 8), 11);
    }

    @Test
    void testAddNegative(){
        Calculator calculator = new Calculator();
        assertEquals(calculator.addition(8, -3), 5);
    }
}