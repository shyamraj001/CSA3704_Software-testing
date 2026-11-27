package Anagram;

import java.util.Arrays;

public class Anagram {

public boolean isAnagram(String str1, String str2) {

    str1 = str1.replaceAll("\\s", "").toLowerCase();
    str2 = str2.replaceAll("\\s", "").toLowerCase();

    if (str1.length() != str2.length()) {
        return false;
    }

    char[] a = str1.toCharArray();
    char[] b = str2.toCharArray();

    Arrays.sort(a);
    Arrays.sort(b);

    return Arrays.equals(a, b);
}

}
