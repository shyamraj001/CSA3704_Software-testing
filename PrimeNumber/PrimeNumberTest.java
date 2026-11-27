package PrimeNumber;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PrimeNumberTest {

PrimeNumber obj = new PrimeNumber();

@Test
void testPrimeNumber() {
    assertTrue(obj.isPrime(7));
}

@Test
void testNonPrimeNumber() {
    assertFalse(obj.isPrime(8));
}

@Test
void testNumberOne() {
    assertFalse(obj.isPrime(1));
}

@Test
void testZero() {
    assertFalse(obj.isPrime(0));
}

@Test
void testNegativeNumber() {
    assertFalse(obj.isPrime(-5));
}

@Test
void testLargePrimeNumber() {
    assertTrue(obj.isPrime(97));
}

}
