package CompoundInterest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CompoundInterestTest{

CompoundInterest obj = new CompoundInterest();

@Test
void testNormalCompoundInterest() {
    assertEquals(210.00, obj.calculateCI(1000, 10, 2), 0.01);
}

@Test
void testZeroRate() {
    assertEquals(0.00, obj.calculateCI(1000, 0, 5), 0.01);
}

@Test
void testZeroTime() {
    assertEquals(0.00, obj.calculateCI(1000, 10, 0), 0.01);
}

@Test
void testInvalidPrincipal() {
    assertThrows(IllegalArgumentException.class,
            () -> obj.calculateCI(-1000, 10, 2));
}

@Test
void testInvalidRate() {
    assertThrows(IllegalArgumentException.class,
            () -> obj.calculateCI(1000, -10, 2));
}

}
