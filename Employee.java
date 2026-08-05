import java.io.Serializable;

abstract class Employee implements Serializable {
    private static final long serialVersionUID = 1L;
    protected String name;
    protected int id;
    protected String department;
    protected String role;
    
    public Employee(String name, int id, String department, String role) {
        this.name = name;
        this.id = id;
        this.department = department;
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public abstract void displayDetails();
}
class Manager extends Employee {
    private String level;  // e.g., Senior, Junior

    public Manager(String name, int id, String department, String level) {
        super(name, id, department, "Manager");
        this.level = level;
    }

    @Override
    public void displayDetails() {
        System.out.println("Manager: " + name + " | ID: " + id + " | Dept: " + department + " | Level: " + level);
    }
}

class Engineer extends Employee {
    private String specialty; // e.g., Software, Hardware

    public Engineer(String name, int id, String department, String specialty) {
        super(name, id, department, "Engineer");
        this.specialty = specialty;
    }

    @Override
    public void displayDetails() {
        System.out.println("Engineer: " + name + " | ID: " + id + " | Dept: " + department + " | Specialty: " + specialty);
    }
}

class SalesPerson extends Employee {
    private int targetAchieved;

    public SalesPerson(String name, int id, String department, int targetAchieved) {
        super(name, id, department, "Sales");
        this.targetAchieved = targetAchieved;
    }

    @Override
    public void displayDetails() {
        System.out.println("Sales Person: " + name + " | ID: " + id + " | Dept: " + department + " | Target: " + targetAchieved);
    }
}
