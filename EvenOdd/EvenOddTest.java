package EvenOdd;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EvenOddTest {

EvenOdd obj = new EvenOdd();

@Test
void testEvenNumber() {
    assertEquals("Even", obj.checkEvenOdd(10));
}

@Test
void testOddNumber() {
    assertEquals("Odd", obj.checkEvenOdd(7));
}

@Test
void testZero() {
    assertEquals("Even", obj.checkEvenOdd(0));
}

@Test
void testNegativeEvenNumber() {
    assertEquals("Even", obj.checkEvenOdd(-4));
}

@Test
void testNegativeOddNumber() {
    assertEquals("Odd", obj.checkEvenOdd(-3));
}

}
