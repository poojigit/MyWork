package SingleResponsibility;

public class OrderRepository {

    public void saveOrder(String orderId){
        System.out.println("Order saved to database:" +orderId);
    }
}
