package SingleResponsibility;

public class OrderValidator {
    public boolean isStockAvailable(String orderId) {
        System.out.println("Checking for order:" + orderId);
        return true;
    }
}
