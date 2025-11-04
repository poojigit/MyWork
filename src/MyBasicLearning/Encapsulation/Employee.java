package MyBasicLearning.Encapsulation;

public class Employee {
    private final String id;
    private final String name;

    public Employee(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        Employee e = new Employee("EMP101", "Apoorv Raj");
        System.out.println("Employee ID: " + e.getId());
        System.out.println("Employee Name: " + e.getName());
    }
}

