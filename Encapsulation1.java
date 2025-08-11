//Basic Encapsulation with Getters and Setters
package ObjectOriented;
class Student {
    private String name; // private = hidden from outside

    // Public getter
    public String getName() {
        return name;
    }

    // Public setter
    public void setName(String name) {
        this.name = name;
    }
}

public class Encapsulation1 {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Nikhil"); // Setting value
        System.out.println("Student Name: " + s.getName()); // Getting value
    }
}
//Data (name) is hidden and can only be accessed through get/set methods.