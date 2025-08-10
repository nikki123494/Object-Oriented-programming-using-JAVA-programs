package ObjectOriented;
abstract class Payment {
    abstract void processPayment(double amount);

    void paymentSuccessful() {
        System.out.println("Payment was successful!");
    }
}

class CreditCardPayment extends Payment {
    void processPayment(double amount) {
        System.out.println("Processing credit card payment of $" + amount);
    }
}

public class Abstraction1 {
    public static void main(String[] args) {
        Payment pay = new CreditCardPayment();
        pay.processPayment(550.50);
        pay.paymentSuccessful();
    }
}
