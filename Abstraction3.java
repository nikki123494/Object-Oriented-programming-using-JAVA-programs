package ObjectOriented;

interface Vehicle {
    void start();
    void stop();
}

class Car implements Vehicle {
    public void start() {
    	System.out.println("Car starts with key ignition."); 
    }
    public void stop() { 
    	System.out.println("Car stops using brakes."); 
    }
}

class Bike implements Vehicle {
    public void start() {
    	System.out.println("Bike starts with kick start."); 
    }
    public void stop() {
    	System.out.println("Bike stops with hand brakes."); 
    }
}

public class Abstraction3 {
    public static void main(String[] args) {
        Vehicle v1 = new Car();
        Vehicle v2 = new Bike();
        v1.start();
        v2.start();
    }
}
