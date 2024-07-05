package lab1;

class Employee {
 private int employeeId;
 private String name;
 private double salary;

 public Employee(int employeeId, String name, double salary) {
     this.employeeId = employeeId;
     this.name = name;
     this.salary = salary;
 }

 public int getEmployeeId() {
     return employeeId;
 }

 public String getName() {
     return name;
 }

 public double getSalary() {
     return salary;
 }

 @Override
 public String toString() {
     return "Employee{" +
             "employeeId=" + employeeId +
             ", name='" + name + '\'' +
             ", salary=" + salary +
             '}';
 }
 public static void main(String[] args) {
     Faculty faculty = new Faculty(1, "John Doe", 80000.0, "Computer Science");
     Staff staff = new Staff(2, "Jane Smith", 50000.0, "Administrative Assistant");

     System.out.println(faculty.toString());
     System.out.println(staff.toString());
 }
}

class Faculty extends Employee {
 private String department;

 public Faculty(int employeeId, String name, double salary, String department) {
     super(employeeId, name, salary);
     this.department = department;
 }

 public String getDepartment() {
     return department;
 }

 @Override
 public String toString() {
     return "Faculty{" +
             "employeeId=" + getEmployeeId() +
             ", name='" + getName() + '\'' +
             ", salary=" + getSalary() +
             ", department='" + department + '\'' +
             '}';
 }
}


class Staff extends Employee {
 private String jobTitle;

 public Staff(int employeeId, String name, double salary, String jobTitle) {
     super(employeeId, name, salary);
     this.jobTitle = jobTitle;
 }

 public String getJobTitle() {
     return jobTitle;
 }

 @Override
 public String toString() {
     return "Staff{" +
             "employeeId=" + getEmployeeId() +
             ", name='" + getName() + '\'' +
             ", salary=" + getSalary() +
             ", jobTitle='" + jobTitle + '\'' +
             '}';
 }
}


