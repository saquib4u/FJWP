package june12.multilevelInheritance;

public class Manager extends Employee{
	private int teamSize;

    public Manager(String name, int age, int employeeId, String department, int teamSize) {
        super(name, age, employeeId, department);
        this.teamSize = teamSize;
    }

    public String displayManagerInfo() {
        return displayEmployeeInfo() + ", Team Size: " + teamSize;
    }
    public static void main(String[] args) {
        Manager manager = new Manager("Alice Johnson", 40, 12345, "IT", 10);

        System.out.println(manager.displayPersonalInfo());  
        System.out.println(manager.displayEmployeeInfo());
        System.out.println(manager.displayManagerInfo()); 
    }
}
