package SingleResponsibility;

public class PDFInvoice implements InvoiceFormat {


    @Override
    public void generate(String orderId) {
        System.out.println("PDF invoice is generated:" +orderId);
    }
}
