package ObjectOriented;
class Employeee {
    private int empId;

    public Employeee(int empId) {
        this.empId = empId;
    }

    public int getEmpId() {
        return empId; // No setter, so it's read-only
    }
}

public class Encapsulation3 {
    public static void main(String[] args) {
        Employeee e = new Employeee(101);
        System.out.println("Employee ID: " + e.getEmpId());
        // e.setEmpId(102);   Not possible
    }
}

//Read-Only Encapsulation,,,, You can create read-only fields by omitting setters.