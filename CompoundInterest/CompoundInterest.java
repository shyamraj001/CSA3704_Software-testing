package CompoundInterest;

public class CompoundInterest {

public double calculateCI(double principal, double rate, int time) {
    if (principal < 0 || rate < 0 || time < 0) {
        throw new IllegalArgumentException("Inputs cannot be negative");
    }

    double amount = principal * Math.pow(1 + rate / 100, time);

    return amount - principal;
}

}
