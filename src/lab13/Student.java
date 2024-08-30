package lab13;

public class Student {
 // Instance variables
 private String name;
 private int age;
 private String department;

 // Default constructor
 public Student() {
     this.name = "Unknown";
     this.age = 20;
     this.department = "Unassigned";
 }

 // Constructor with two parameters
 public Student(String name, int age) {
     this.name = name;
     this.age = age;
     this.department = "IT";
 }

 // Constructor with three parameters
 public Student(String name, int age, String department) {
     this.name = name;
     this.age = age;
     this.department = department;
 }

 // Getters and setters for instance variables
 public String getName() {
     return name;
 }

 public void setName(String name) {
     this.name = name;
 }

 public int getAge() {
     return age;
 }

 public void setAge(int age) {
     this.age = age;
 }

 public String getDepartment() {
     return department;
 }

 public void setDepartment(String department) {
     this.department = department;
 }
}
