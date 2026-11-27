package VowelConstant;

public class VowelConstant{

public int countVowels(String str) {
    int count = 0;

    for (int i = 0; i < str.length(); i++) {
        char ch = Character.toLowerCase(str.charAt(i));

        if (ch == 'a' || ch == 'e' || ch == 'i' ||
            ch == 'o' || ch == 'u') {
            count++;
        }
    }

    return count;
}

public int countConsonants(String str) {
    int count = 0;

    for (int i = 0; i < str.length(); i++) {
        char ch = Character.toLowerCase(str.charAt(i));

        if (ch >= 'a' && ch <= 'z' &&
            ch != 'a' && ch != 'e' && ch != 'i' &&
            ch != 'o' && ch != 'u') {
            count++;
        }
    }

    return count;
}

}
