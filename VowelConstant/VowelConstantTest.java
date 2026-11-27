package VowelConstant;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VowelConstantTest {


VowelConstant obj = new VowelConstant();

@Test
void testVowelCount() {
    assertEquals(2, obj.countVowels("hello"));
}

@Test
void testConsonantCount() {
    assertEquals(3, obj.countConsonants("hello"));
}

@Test
void testUppercaseString() {
    assertEquals(2, obj.countVowels("APPLE"));
}

@Test
void testStringWithSpacesAndDigits() {
    assertEquals(2, obj.countVowels("Java 123"));
    assertEquals(2, obj.countConsonants("Java 123"));
}

@Test
void testEmptyString() {
    assertEquals(0, obj.countVowels(""));
    assertEquals(0, obj.countConsonants(""));
}

}
