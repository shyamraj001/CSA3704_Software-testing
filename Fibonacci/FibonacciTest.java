package Fibonacci;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FibonacciTest {

@Test
void testFibonacciZero() {
    Fibonacci fib = new Fibonacci();
    assertEquals(0, fib.fibonacci(0));
}

@Test
void testFibonacciOne() {
    Fibonacci fib = new Fibonacci();
    assertEquals(1, fib.fibonacci(1));
}

@Test
void testFibonacciFive() {
    Fibonacci fib = new Fibonacci();
    assertEquals(5, fib.fibonacci(5));
}

@Test
void testFibonacciTen() {
    Fibonacci fib = new Fibonacci();
    assertEquals(55, fib.fibonacci(10));
}

@Test
void testNegativeNumber() {
    Fibonacci fib = new Fibonacci();
    assertThrows(IllegalArgumentException.class,
            () -> fib.fibonacci(-1));
}
}
