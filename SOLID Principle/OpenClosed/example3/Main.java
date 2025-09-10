package OpenClosed.example3;

public class Main {

    public static void main(String[] args) {
       TaxCalculator taxCalculator=new TaxCalculator(new IndiaTax());
        System.out.println("Tax imposed in India: " + taxCalculator.calculate(1000));

    }
}
