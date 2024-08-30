package lab13;

public class displayStudent {
 public static void main(String[] args) {
     // Create instance using default constructor
     Student student1 = new Student();
     System.out.println("Student 1: " + student1.getName() + ", " + student1.getAge() + ", " + student1.getDepartment());

     // Create instance using constructor with two parameters
     Student student2 = new Student("Saquib", 25);
     System.out.println("Student 2: " + student2.getName() + ", " + student2.getAge() + ", " + student2.getDepartment());

     // Create instance using constructor with three parameters
     Student student3 = new Student("Zaid", 30, "Computer Science");
     System.out.println("Student 3: " + student3.getName() + ", " + student3.getAge() + ", " + student3.getDepartment());
 }
}
