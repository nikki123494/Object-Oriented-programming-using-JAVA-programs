package ObjectOriented;
class BankAccount {
    private double balance;

    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Invalid balance amount!");
        }
    }

    public double getBalance() {
        return balance;
    }
}

public class Encapsulation2 {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        acc.setBalance(1000);
        System.out.println("Balance: Rs." + acc.getBalance());

        acc.setBalance(-500); // Invalid
    }
}

//Validation inside Setter,,,,,Encapsulation allows control over how data is set.