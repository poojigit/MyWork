package OpenClosed.example3;

public class IndiaTax implements TaxStrategy {


    @Override
    public double calculateTax(double amount) {
        return amount*0.18;
    }
}
