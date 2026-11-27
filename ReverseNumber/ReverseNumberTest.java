package ReverseNumber;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ReverseNumberTest {


ReverseNumber obj = new ReverseNumber();

@Test
void testNormalNumber() {
    assertEquals(54321, obj.reverse(12345));
}

@Test
void testSingleDigit() {
    assertEquals(7, obj.reverse(7));
}

@Test
void testZero() {
    assertEquals(0, obj.reverse(0));
}

@Test
void testNumberEndingWithZero() {
    assertEquals(321, obj.reverse(12300));
}

@Test
void testNegativeNumber() {
    assertEquals(-543, obj.reverse(-345));
}

}
