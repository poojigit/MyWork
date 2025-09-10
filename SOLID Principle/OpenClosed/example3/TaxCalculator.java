package OpenClosed.example3;

public class TaxCalculator {

    private TaxStrategy taxStrategy;
    public TaxCalculator(TaxStrategy taxStrategy) {
        this.taxStrategy = taxStrategy;
    }
        public double calculate(double amount){
            return taxStrategy.calculateTax(amount);
        }
}
