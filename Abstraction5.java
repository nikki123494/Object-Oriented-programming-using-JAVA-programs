package ObjectOriented;
interface Order {
    void placeOrder();
    void cancelOrder();
}

class OnlineOrder implements Order {
    public void placeOrder() { System.out.println("Order placed through website."); }
    public void cancelOrder() { System.out.println("Order cancelled online."); }
}

class StoreOrder implements Order {
    public void placeOrder() { System.out.println("Order placed at store counter."); }
    public void cancelOrder() { System.out.println("Order cancelled at store."); }
}

public class Abstraction5 {
    public static void main(String[] args) {
        Order o1 = new OnlineOrder();
        Order o2 = new StoreOrder();
        o1.placeOrder();
        o2.cancelOrder();
    }
}

