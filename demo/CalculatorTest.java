package demo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    void testAddition() {
        Calculator calc = new Calculator();
        assertEquals(30, calc.add(10, 20));
    }

    @Test
    void testSubtraction() {
        Calculator calc = new Calculator();
        assertEquals(10, calc.subtract(20, 10));
    }

    @Test
    void testAdditionWithZero() {
        Calculator calc = new Calculator();
        assertEquals(10, calc.add(10, 0));
    }
}