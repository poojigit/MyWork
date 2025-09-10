package OpenClosed.example3;

public class NepalTax implements TaxStrategy {

    @Override
    public double calculateTax(double amount) {
        return amount*0.29;
    }
}
