package SingleResponsibility;

public class CSVInvoice implements InvoiceFormat{
    @Override
    public void generate(String orderId) {
        System.out.println("CSV invoice is generated:" +orderId);
    }
}
