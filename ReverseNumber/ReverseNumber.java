package ReverseNumber;

public class ReverseNumber{


public int reverse(int num) {
    int rev = 0;

    while (num != 0) {
        int digit = num % 10;
        rev = rev * 10 + digit;
        num = num / 10;
    }

    return rev;
}


}
