package ObjectOriented;
class StudentMarks {
    private int marks;

    public void setMarks(int marks) {
        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
        } else {
            System.out.println("Invalid marks! Must be between 0 and 100.");
        }
    }

    public int getMarks() {
        return marks;
    }
}

public class Encapsulation5 {
    public static void main(String[] args) {
        StudentMarks sm = new StudentMarks();
        sm.setMarks(85);
        System.out.println("Marks: " + sm.getMarks());

        sm.setMarks(150); // Invalid
    }
}

//Encapsulation ensures data integrity by validating inputs.
/* Importance of Encapsulation
1️. Data Hiding
Encapsulation keeps fields private and hides them from direct access.

Outside code cannot directly change sensitive data.

Example: Your bank balance is private — you can’t just change it from outside the bank’s system.

2️.Controlled Access
Access is provided through getters and setters.

You can add validation logic before accepting data.

Example: In a marks system, you can reject marks greater than 100 or less than 0.

3️.Improved Security
Sensitive information (like passwords, account details) can be protected.

4️. Flexibility & Maintainability
You can change the internal implementation without affecting outside code.

Example: If you later change how salary is calculated, the class interface remains the same — only internal code changes.

5️.Better Code Organization
Encapsulation encourages grouping of related variables and methods into one unit (class).

Helps in modular programming — makes debugging and testing easier */

