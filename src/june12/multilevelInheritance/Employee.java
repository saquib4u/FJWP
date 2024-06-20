package june12.multilevelInheritance;

public class Employee extends Person{
	private int employeeId;
    private String department;

    public Employee(String name, int age, int employeeId, String department) {
        super(name, age);
        this.employeeId = employeeId;
        this.department = department;
    }

    public String displayEmployeeInfo() {
        return displayPersonalInfo() + ", Employee ID: " + employeeId + ", Department: " + department;
    }
}
