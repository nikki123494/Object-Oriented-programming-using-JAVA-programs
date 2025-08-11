package ObjectOriented;
class SecureData {
    private String password;

    public void setPassword(String password) {
        this.password = password;
        System.out.println("Password set successfully!");
    }
    // No getter for password
}

public class Encapsulation4 {
    public static void main(String[] args) {
        SecureData sd = new SecureData();
        sd.setPassword("mySecret123");
        // System.out.println(sd.password); //  Can't access directly
    }
}
