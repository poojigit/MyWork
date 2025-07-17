package SingleResponsibility;

public class OrderProcessor {

    private final OrderValidator validator;
    private final OrderRepository repository;
    private final EmailSender emailSender;
    private final InvoiceGenerator invoiceGenerator;



    public OrderProcessor(OrderValidator validator, EmailSender emailSender,
                          OrderRepository repository, InvoiceGenerator invoicegenerator){
        this.validator=validator;
        this.emailSender = emailSender;
        this.repository=repository;
        this.invoiceGenerator =invoicegenerator;
    }

    public void processOrder (String orderId, String email){

        if(!validator.isStockAvailable(orderId)){
            System.out.println("Stock not available for order:" +orderId);
            return;
        }

        repository.saveOrder(orderId);
        emailSender.sendConfirmationEmail(email);
        invoiceGenerator.generateInvoice(orderId);

    }


}
