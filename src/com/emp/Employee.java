package com.emp;
/*/ you have to create a class Employee then some fields like empId , empName, empDepartment, empSalary 
	// then you have to create both constructor default & parameterized
	// then you have to create method like display
	// method empShift that is return string 
	// then you have to  create 5 object  of employee then assign them  value with constructor and you have to run each method with each object
// some object with parameterized constructor and some with default constructor
 */
class Employee {
    private int empId;
    private String empName;
    private String empDepartment;
    private double empSalary;

    //default constructor initialized
    Employee() {};

    //parameterized constructor initialized
    public Employee(int empId, String empName, String empDepartment, double empSalary) {
        this.empId = empId;
        this.empName = empName;
        this.empDepartment = empDepartment;
        this.empSalary = empSalary;
    }

    //display method
    public void display() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Employee Department: " + empDepartment);
        System.out.println("Employee Salary: Rs" + empSalary);
    }

    
    public String empShift() {
        return "Night Shift";
    }

    public static void main(String[] args) {
    	//making objects
        Employee emp1 = new Employee();
        Employee emp2 = new Employee(102, "abc", "HR", 50000);
        Employee emp3 = new Employee(103, "def", "Engineering", 75000);
        Employee emp4 = new Employee(104, "ghi", "Marketing", 60000);
        Employee emp5 = new Employee();

        emp1.empId = 101;
        emp1.empName = "1st employee using default constructor";
        emp1.empDepartment = "Finance";
        emp1.empSalary = 45000;

        emp5.empId = 105;
        emp5.empName = "5th employee using default constructor";
        emp5.empDepartment = "Sales";
        emp5.empSalary = 65000;

        //printing
        System.out.println("Details of Employee 1:");
        emp1.display();
        System.out.println("Shift: " + emp1.empShift());
        
        System.out.println("\nDetails of Employee 2:");
        emp2.display();
        System.out.println("Shift: " + emp2.empShift());

        System.out.println("\nDetails of Employee 3:");
        emp3.display();
        System.out.println("Shift: " + emp3.empShift());

        System.out.println("\nDetails of Employee 4:");
        emp4.display();
        System.out.println("Shift: " + emp4.empShift());

        System.out.println("\nDetails of Employee 5:");
        emp5.display();
        System.out.println("Shift: " + emp5.empShift());
    }
}

