package InterfaceSegregation.example3;

public class ModernPrinter implements Printer, Scanner, Fax{
    @Override
    public void fax() {
        System.out.println("Modern Printer can send fax");
    }

    @Override
    public void print() {
        System.out.println("Modern printer can print the document");

    }

    @Override
    public void scan() {
        System.out.println("Modern printer can scan the document also");
    }
}
