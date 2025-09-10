package InterfaceSegregation.example3;

public class Main {
    public static void main(String[] args) {
        System.out.println("About Old Printer");
        OldPrinter oldPrinter=new OldPrinter();
        oldPrinter.print();

        System.out.println("About Modern Printer");
        ModernPrinter modernPrinter=new ModernPrinter();
        modernPrinter.fax();
        modernPrinter.print();
        modernPrinter.scan();
    }
}
