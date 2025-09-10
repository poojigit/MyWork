package InterfaceSegregation.example3;

public class OldPrinter implements Printer {

    @Override
    public void print() {
        System.out.println("Printing using Old Printer");
    }
}
