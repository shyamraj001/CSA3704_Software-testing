package Anagram;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AnagramTest {


@Test
void testAnagram() {
    Anagram obj = new Anagram();
    assertTrue(obj.isAnagram("listen", "silent"));
}

@Test
void testNotAnagram() {
    Anagram obj = new Anagram();
    assertFalse(obj.isAnagram("hello", "world"));
}

@Test
void testDifferentLengths() {
    Anagram obj = new Anagram();
    assertFalse(obj.isAnagram("cat", "cats"));
}

@Test
void testUppercaseAndLowercase() {
    Anagram obj = new Anagram();
    assertTrue(obj.isAnagram("Listen", "Silent"));
}

@Test
void testSpaces() {
    Anagram obj = new Anagram();
    assertTrue(obj.isAnagram("dormitory", "dirty room"));
}


}
