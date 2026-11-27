package Maximum;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MaximumTest {

Maximum obj = new Maximum();

@Test
void testFirstNumberIsMaximum() {
    assertEquals(10, obj.findMax(10, 5, 3));
}

@Test
void testSecondNumberIsMaximum() {
    assertEquals(20, obj.findMax(10, 20, 5));
}

@Test
void testThirdNumberIsMaximum() {
    assertEquals(30, obj.findMax(10, 5, 30));
}

@Test
void testAllNumbersEqual() {
    assertEquals(10, obj.findMax(10, 10, 10));
}

@Test
void testNegativeNumbers() {
    assertEquals(-2, obj.findMax(-5, -2, -8));
}
}
