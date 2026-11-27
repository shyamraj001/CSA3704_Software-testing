package Fibonacci;

public class Fibonacci {

public int fibonacci(int n) {
    if (n < 0) {
        throw new IllegalArgumentException("Number must be non-negative");
    }

    if (n <= 1) {
        return n;
    }

    int a = 0, b = 1;

    for (int i = 2; i <= n; i++) {
        int c = a + b;
        a = b;
        b = c;
    }

    return b;
}

}
