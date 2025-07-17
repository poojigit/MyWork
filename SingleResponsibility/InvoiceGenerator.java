package SingleResponsibility;

public class InvoiceGenerator {


    private final InvoiceFormat format;

    public InvoiceGenerator(InvoiceFormat format)
    {
        this.format=format;
    }
    public void generateInvoice(String orderId){
        format.generate(orderId);
    }
}
