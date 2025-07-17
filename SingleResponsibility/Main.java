package SingleResponsibility;

public class Main {
    public static void main(String[] args) {
        OrderValidator validator = new OrderValidator();
        OrderRepository repository = new OrderRepository();



        InvoiceFormat format = new PDFInvoice();
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator(format);
        EmailService service=new SMTPEmail();
        EmailSender emailSender=new EmailSender(service);


        OrderProcessor processor = new OrderProcessor(validator, emailSender, repository, invoiceGenerator);

        processor.processOrder("ord123", "customer@gmail.com");
    }
}
